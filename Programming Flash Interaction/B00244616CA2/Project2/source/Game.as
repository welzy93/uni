package
{
	import flash.display.MovieClip;
	import flash.events.*;
	import flash.text.*;
	import flash.utils.*;
	import flash.events.Event; 
	import flash.media.Sound; 
	import flash.net.URLRequest;
	
	import Game.*;
	
	
	public class Game extends MovieClip
	{
		
		private var _root:Object;
		private var player:Player;
		private var playerScore:Number;

		private var enemies:Array;
		private var bullets:Array;
		private var lastBulletTime:Number;
		
		//User Input
		private var moveX, moveY:Number;
		private var fireBullet:Boolean;
		
		//Scrolling Background
		private var Background1:StarField;
		private var Background2:StarField;
		
		public function Game()
		{
			
			_root = MovieClip(root);
			startGame();
			
			
			
		}
		
		
		public function startGame()
		{
			trace("hi");
			
			
				
			//Create player
			player = new Player();
			player.x = C.PLAYER_START_X;
			player.y = C.PLAYER_START_Y;
			GameStage.addChild(player);
			
			playerScore = C.PLAYER_START_SCORE;
			
			moveX = 0;
			fireBullet = false;
			lastBulletTime = getTimer();
			
			enemies = new Array();
			bullets = new Array();
			
			Background1 = new StarField();
			Background2 = new StarField();
			Background2.x = Background1.width;

			GameStage.addChildAt(Background1,0);
			GameStage.addChildAt(Background2,0);
			
			GameStage.addEventListener(Event.ENTER_FRAME,update);
			
			//Handle event when this game is being preloaded
			addEventListener(Event.ADDED_TO_STAGE, gameAddedToStage ); 
			
			//Handle situations when this game is being run directly
			if (stage != null)
			{
				stage.addEventListener(KeyboardEvent.KEY_DOWN,keyDownHandler);
				stage.addEventListener(KeyboardEvent.KEY_UP,keyUpHandler);
			}
		}		
		
		private function gameAddedToStage(evt: Event):void
		{
			stage.addEventListener(KeyboardEvent.KEY_DOWN,keyDownHandler);
			stage.addEventListener(KeyboardEvent.KEY_UP,keyUpHandler);
		}		
		
		private function keyDownHandler(evt:KeyboardEvent):void
		{
			if (evt.keyCode == 32)
			{
				//Fire bullet
				fireBullet = true;
				var shootSound:Sound =new Sound();
				shootSound.load(new URLRequest ("LaserBlast.mp3"));
				shootSound.play();
				
			}
			else if ((evt.keyCode == 37) || (evt.keyCode == 65))
			{
				//Move player left
				moveX = -1;
			}
			else if ((evt.keyCode == 39) || (evt.keyCode == 68))
			{
				//Move player right
				moveX = 1;
			}
			
			if ((evt.keyCode == 38) || (evt.keyCode == 87)) 
			{
				//Move player up
				moveY = -1;
			}
			else if ((evt.keyCode == 40) || (evt.keyCode == 83))
			{
				//Move player down
				moveY = 1;
			}
		}
	
		private function keyUpHandler(evt:KeyboardEvent):void
		{
			if ((evt.keyCode == 37) || (evt.keyCode == 65))
			{
				moveX = 0;
			}
			else if ((evt.keyCode == 39) || (evt.keyCode == 68))
			{
				moveX = 0;
			}
			else if ((evt.keyCode == 38) || (evt.keyCode == 87)) 
			{
				moveY = 0;
			}
			else if ((evt.keyCode == 40) || (evt.keyCode == 83))
			{
				moveY = 0;
			}
		}
		
		private function update(evt:Event)
		{
			
			//Handle User Input
			
			if (moveX > 0)
			{
				if (player.x <= C.PLAYER_RIGHT_BOUND)
					player.x += C.PLAYER_SPEED;
			}
			else if (moveX < 0)
			{
				if (player.x > C.PLAYER_LEFT_BOUND)
					player.x -= C.PLAYER_SPEED;	
			}
			if (moveY > 0)
			{
				if (player.y <= C.PLAYER_DOWN_BOUND)
					player.y += C.PLAYER_SPEED;
			}
			else if (moveY < 0)
			{
				if (player.y > C.PLAYER_UP_BOUND)
					player.y -= C.PLAYER_SPEED;	
			}
			
			//Handle Firing of bullets
			if (fireBullet)
			{
				var currTime = getTimer();
				
				if (currTime - lastBulletTime > C.BULLET_DELAY)
				{
					lastBulletTime = currTime;
					
					var newBullet = new Bullet(player.x, player.y);
					bullets.push(newBullet);
					GameStage.addChild(newBullet);
				}
				
				fireBullet = false;
			}
			
			
			//Check to spawn new enemies
			if (Math.random() < C.SPAWN_ENEMY_CHANCE)
			{
				//Create a new monster
				var newEnemy = new Enemy();
				enemies.push(newEnemy);
				GameStage.addChild(newEnemy);
			}
			
			//Update enemies
			for (var i=enemies.length - 1; i >= 0; i--)
			{
				enemies[i].update();
			}
			
			//Update bullets
			for (var i=bullets.length - 1; i >= 0; i--)
			{
				bullets[i].update();
				
				if (bullets[i].notInScreen())
				{
					GameStage.removeChild(bullets[i]);
					bullets.splice(i,1);
				}
			}
			
			//Check for collision
			
			for (var i=bullets.length - 1; i >= 0; i--)
			{
				for (var j=enemies.length - 1; j >= 0; j--)
				{
					if (bullets[i].hitTestObject(enemies[j].collisionArea))
					{
						//Increase player score
						playerScore += enemies[j].getPointsWorth();
						_root.finalScore = playerScore;
						_root.displayScore.text=("Score : "+playerScore);
						trace(playerScore);
						//Remove bullet and enemy
						GameStage.removeChild(bullets[i]);
						GameStage.removeChild(enemies[j]);
						bullets.splice(i,1);
						enemies.splice(j,1);
						
						break;
					}
				}
			}
			
			//Player and Enemy collisions
			for (var j=enemies.length - 1; j >= 0; j--)
			{
				if (player.collisionArea.hitTestObject(enemies[j].collisionArea))
				{
					GameStage.removeChild(player);
					GameStage.removeChild(enemies[j]);
					
					enemies.splice(j,1);
					
					player = null;
					
					gameOver();
					
					break;
				}
			}
			
			//******************
			//Handle Display
			//******************
			//Update scrolling of background image
			Background1.x -= C.SCROLL_SPEED;
			Background2.x -= C.SCROLL_SPEED;
			if (Background1.x <= - Background1.width)
			{
				//switch it to the back of background 2
				Background1.x = Background2.x + Background2.width;
			}
			else if (Background2.x <= - Background2.width)
			{
				//switch it to the back of background 1
				Background2.x = Background1.x + Background1.width;
			}
			
			//Display new Score
			//ScorePlayer.text = String(playerScore);
			
		}
		
		private function gameOver()
		{
			player = null;
			bullets = null;
			enemies = null;

			GameStage.removeEventListener(Event.ENTER_FRAME,update);
			stage.removeEventListener(KeyboardEvent.KEY_DOWN,keyDownHandler);
			stage.removeEventListener(KeyboardEvent.KEY_UP,keyUpHandler);
			gotoAndStop(4);
		}
	}	
}