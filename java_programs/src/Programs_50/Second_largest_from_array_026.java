package Programs_50;

public class Second_largest_from_array_026 {
public static void main(String[] args) {
	int arr[]= {2,11,5,1,6};
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(arr[arr.length-2]);
}
}
