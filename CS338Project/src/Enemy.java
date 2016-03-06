	
	public class Enemy 
	{
		int hp;
		  
		public Enemy()
		{
			hp = 100; 
		}
		
		public void enemyAttacked()
	    {
		   hp = hp - 20;
		}
		public void MagicAttacked()
	    {
		   hp = hp - 30;
		}
		
		 
		public int getHp()
		{
		 	
		 if(hp <= 0)
		 {
			 System.out.print("HEROS WIN \n");
		 }
		 return hp;
		 
		}
	}
