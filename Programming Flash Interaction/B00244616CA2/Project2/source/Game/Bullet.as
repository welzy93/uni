package Game
{
	import flash.display.MovieClip;
	
	public class Bullet extends MovieClip
	{		
		public function Bullet(xPos:Number, yPos:Number)
		{
			this.x = xPos;
			this.y = yPos;
		}
		
		public function update()
		{
			//enemy is moving to the right, hence +
			this.x += C.BULLET_SPEED;
		}
		
		public function notInScreen():Boolean
		{
			return (this.x > C.GAME_WIDTH);
		}
	}
}