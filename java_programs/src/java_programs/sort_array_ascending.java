package java_programs;

public class sort_array_ascending {
public static void main(String[] args) {
	int arr[]= {100, 25, 85, 6};
for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);	
	}
	
}
}
