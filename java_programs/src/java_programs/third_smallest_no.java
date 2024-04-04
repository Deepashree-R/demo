package java_programs;

public class third_smallest_no {
public static void main(String[] args) {
	int arr[]= {5,2, 25, 32, 65, 50, 100};
	
//	with sorting
//	for(int i=0; i<arr.length; i++)
//	{
//		for(int j=0; j<arr.length; j++)
//		{
//			if(arr[i]<arr[j])
//			{
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//	}
//	System.out.println(arr[2]);
	
//	without sorting
	int firstsmallest=arr[0];
	int secondsmallest=arr[0];
	int thirdsmallest=arr[0];
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]<thirdsmallest)
		{
			
			firstsmallest=secondsmallest;
			secondsmallest=thirdsmallest;
			thirdsmallest=arr[i];			
		}
		else if(arr[i]<secondsmallest)
		{
			firstsmallest=secondsmallest;
			secondsmallest=arr[i];
		}
		else if(arr[i]<firstsmallest)
		{
			firstsmallest=arr[i];
		}
	}
	System.out.println(firstsmallest);
	System.out.println(secondsmallest);
	System.out.println(thirdsmallest);
}
}
