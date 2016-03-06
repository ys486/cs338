	
	public class Charater
	{
	
	     String name;
	     String type;
	     
	     int hp;
	     int maxhp;
	     int armor=5;
	     int items;
	     int strength;
	     
		   public String getType()
		   {
			  
			   return type;
		   }
		   public void setType(String type)
		   {
			  
			   this.type = type;
		   }
		   
	     public int getStrength()
	     {
	  	   return strength;
	     }
	     public int getMaxHp()
	     {
	  	   return maxhp;
	     }
	    public void commonAttacked()
	    {
	    	hp = hp - 20; 
	    }
	    
	    public String getName()
	    {
	 	   return name;
	    }
	    
	    public int getHp()
	    {
	 	   return hp;
	    }
	    
	    public int getItems()
	    {
	 	   return items;
	    }
	    
	    public void setName(String name)
	    {
	    	this.name = name;
	    }
	    
	    public void setHp(int hp)
	    {
	    	this.hp = hp;
	    }   
	    
	    public void setItems(int items)
	    {
	    	this.items = items;
	    }
	
	    public void defend()
	    {  
	    	hp = hp + armor - 20;
	    }
	    public void items()
	    {  
	    	hp = hp + 10 - 20;
	    }
	    
	}
