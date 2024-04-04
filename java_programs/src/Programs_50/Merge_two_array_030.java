package Programs_50;

public class Merge_two_array_030 {
public static void main(String[] args) {
	int arr1[]= {1,2,3,4};
	int arr2[]= {3,5,6,7,8};
	int l1=arr1.length;
	int l2=arr2.length;
	int l3=l1+l2;
	int arr3[]=new int[l3];
	int j=0;
	for(int i=0; i<l3; i++) {
		if(i<l1) {
			arr3[i]=arr1[i];
		}else {
			arr3[i]=arr2[j];
			j++;
		}
	}
	for(int i=0; i<l3; i++) {
		System.out.println(arr3[i]);
	}
}
}
