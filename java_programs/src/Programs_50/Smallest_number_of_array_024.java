package Programs_50;

public class Smallest_number_of_array_024 {
	public static void main(String[] args) {
		int arr[]= {1,2,0,45,89};
		int smallest=arr[0];
		for(int i=1; i<=arr.length-1; i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("smallest number in the array is "+smallest);
	}
}
