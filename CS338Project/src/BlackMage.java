	public class BlackMage extends Charater
	{
	   
	   
	   public BlackMage(int strength)
	   {
		   this.strength = strength;
		   
		   this.hp = 180;
		   this.maxhp = 180;
		   this.name= "BMage";
	   }
	   
	   public void spellAttack()
	   {
		   strength = strength - 25; 
		   hp = hp - 20;
	   }
	   
	   public void heal()
	   {
		   hp = hp + 20;
	   }
	
	}