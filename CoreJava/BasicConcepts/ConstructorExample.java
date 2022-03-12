package BasicConcepts;
class Product{
	private int pid;
	private String pname;
	/*Product(){
		this.pid=0;// this keyword always indicates to current object 
		this.pname=null;
	}
	
	Product(int pid,String pname){
		this.pid=pid;
		this.pname=pname;
	}*/
	public Product(int pid, String pname) {
		this();//default constructor. It should be first line in code
		this.pid = pid;
		this.pname = pname;
	}
	public Product() {
		this.pid=0;// this keyword always indicates to current object 
		this.pname=null;
	}
	
	
}
public class ConstructorExample {

	public static void main(String[] args) {
		Product p1=new Product();//First constructor
		Product p2=new Product(12,"Sugar");// Second Constructor

	}

}
