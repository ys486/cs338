	public class Monk extends Charater
	{
	    
	   public void MonkAttack()
	   {
		   
		   strength = strength - 15;
		   
		   hp=hp-20;
	   }
	   
	   public Monk()
	   {
		   strength = 100;
		   hp = 230; 
		   maxhp=230;
		   name= "monk";
		   }
	   
	   public void heal()
	   {
		   hp = hp + 20;
	   }  
	}