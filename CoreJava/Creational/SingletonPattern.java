package Design_pattern.Creational;

public class SingletonPattern{
	  private static SingletonPattern instance;
	  private SingletonPattern(){} 
	public static synchronized SingletonPattern getInstance(){
	  if (instance == null)
	  {
	  instance = new SingletonPattern();
	  }
	  return instance;
	  }
	public static void main(String arg[]){
	  System.out.println("The output of two instance:");
	 SingletonPattern sp=SingletonPattern.getInstance();
	  System.out.println("First Instance: "+sp);
	 SingletonPattern sp1=SingletonPattern.getInstance();
	  System.out.println("Second Instance:"+sp1);
	  }
	}