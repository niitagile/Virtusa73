package pkg4;

public class Inforamation {
	
	private String uname, pword;

	public Inforamation(String uname, String pword) {
		super();
		this.uname = uname;
		this.pword = pword;
	}
	public int getLength() {
		return pword.length();
	}
	
	public boolean validate() {
		if(uname.equalsIgnoreCase("Java") && pword.equals("java123"))
			return true;
		else
			return false;
	}

}
