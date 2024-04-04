package Programs_50;

public class largest_number_of_array_023 {
public static void main(String[] args) {
	int arr[]= {1,2,0,45,89};
	int largest=arr[0];
	for(int i=1; i<=arr.length-1; i++)
	{
		if(arr[i]>largest)
		{
			largest=arr[i];
		}
	}
	System.out.println("largest number in the array is "+largest);
}
}
