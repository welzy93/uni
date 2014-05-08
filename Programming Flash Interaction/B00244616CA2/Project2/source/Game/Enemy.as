package Game
{
	import flash.display.MovieClip;
	
	public class Enemy extends MovieClip
	{
		private var speed:Number;
		private var score:Number;
		
		public function Enemy()
		{
			this.x = C.ENEMY_START_X;
			this.y = Math.floor(Math.random() * 400) + 50;
			
			this.speed = C.ENEMY_SPEED;
			
			//Set enemy score
			this.score = C.ENEMY_POINTS;
		}
		
		public function update()
		{
			//enemy is moving to the left, hence -
			this.x -= this.speed;
		}
		
		public function getPointsWorth()
		{
			return this.score;
		}
	}
}