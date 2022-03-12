package BasicConcepts;

public class ArrayInMethod {

static int[] method1(int arr[]){
		int ans[]=new int[arr.length];
		int index=0;
		for(int val: arr) {
			if(val%2==0) 
				ans[index++]=val;
				
			
			}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {23,45,67,89,12};
		int ans[]=method1(arr);
		System.out.println("Even values in array");
		for(int val : ans)
			if(val!=0)
			System.out.println(val);
	}

}
