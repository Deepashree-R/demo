package java_programs;

public class Third_largest_no {
public static void main(String[] args) {
	int arr[]= {5, 25, 32, 65, 50, 100};
	
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
//	System.out.println(arr[arr.length-3]);
	
	
//	without sorting
	int firstlargest=arr[0];
	int secondlargest=arr[0];
	int thirdlargest=arr[0];
	for(int i=0; i<arr.length; i++)
	{
		int arrvar=arr[i];
		
		if(arrvar>firstlargest)
		{
			thirdlargest=secondlargest;
			secondlargest=firstlargest;
			firstlargest=arrvar;
		}
		else if(arrvar>secondlargest)
		{
			thirdlargest=secondlargest;
			secondlargest=arrvar;
		}
		else if(arrvar>thirdlargest)
		{
			thirdlargest=arrvar;
		}
	}
	System.out.println(firstlargest);
	System.out.println(secondlargest);
	System.out.println(thirdlargest);
}
}
