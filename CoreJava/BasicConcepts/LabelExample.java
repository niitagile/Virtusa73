package BasicConcepts;

public class LabelExample {
	public static void main(String[] args) {
		XYZ:
		for(int i=1;i<=3;i++) {
			
			for(int j=1;j<=3;j++) {
				if(j==2)
					break XYZ;
				System.out.print(i);
			}
			
			System.out.println();
		}
	}

}
