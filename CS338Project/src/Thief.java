

	public class Thief extends Charater
	{
	
	   public Thief ()
	   {
		   strength = 100;
		   hp = 200; 
		   maxhp=200;
		   name ="theif";
	   }
	   
	   public void heal()
	   {
		   hp = hp + 20;
	   }
	   
	   public void thiefAttack()
	   {
	   	  strength = strength - 20;
	   	  hp = hp - 20;
	   }
	
	}
