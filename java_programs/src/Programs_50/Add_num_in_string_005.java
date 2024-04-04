package Programs_50;

public class Add_num_in_string_005 {
public static void main(String[] args) {
	String s1="asc123bsd4";
	char arr[]=s1.toCharArray();
	int sum=0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>=48 && arr[i]<=57) {
			sum=sum+arr[i]-48;
		}
	}
	System.out.println(sum);
}
}
