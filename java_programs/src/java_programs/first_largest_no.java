package java_programs;

public class first_largest_no {
public static void main(String[] args) {
	int arr[]= {5, 52, 96,24, 10};
	int large=arr[0];
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]>large)
		{
			large=arr[i];
		}	
	}
	System.out.println(large);
}
}
