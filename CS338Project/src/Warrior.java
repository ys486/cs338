	
	public class Warrior extends Charater
	{
	   
	   public void warriorAttack()
	   {
	   	  
		   strength = strength - 10; 
		   hp = hp - 30;
	   }
	   
	   public Warrior ()
	   {
		   strength = 100;
		   hp = 300; 
		   maxhp=300;
		   name= "warrior";
	   }
	   public void heal()
	   {
		   hp = hp + 20;
	   }
	
	}
