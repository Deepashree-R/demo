package java_programs;

public class first_smallest_number {
public static void main(String[] args) {
	int arr[]={60, 25, 100, 57};
	int smallest=arr[0];
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]<smallest) {
			smallest=arr[i];
		}
	}
	System.out.println(smallest);
}
}
