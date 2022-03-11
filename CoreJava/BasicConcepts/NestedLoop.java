package BasicConcepts;

/* 1
 * 1 2
 * 1 2 3
 */

public class NestedLoop {

	
	
	public static void main(String[] args) {
		for (int j=1;j<=3;j++){
		{
			for(int i=1;i<=j;i++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}

	}

}
}
