package Design_pattern.Creational;

//construct complex object by using simple objects
interface  Item   
{  
   public String name();  
    public String size();  
    public float price();  
}// End of the interface Item.  

abstract class Pizza implements Item{  
    @Override  
    public abstract float price();  
}

abstract class VegPizza extends Pizza{  
    @Override  
    public abstract float price();  
    @Override  
    public abstract  String name();  
    @Override  
    public abstract  String size();  
}// End of the abstract class VegPizza.


class SmallCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 170.0f;  
    }  
    @Override  
    public String name() {  
        return "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
       return "Small size";  
    }    
}// End of the SmallCheezePizza class.  




public class Builder_Design1 {
		public static void main(String[] args) {
			choice: 1. VegPizza
						Onion Pizza
							Small Pizza
							Medium Pizza
							Large Pizza
						Capiscum Pizza
							Small Pizza
							Medium Pizza
							Large Pizza
					2. NonVeg Pzza
			
			new SmallCheezePizza();
		}


	
}