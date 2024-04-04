package Programs_50;

public class Remove_numbers_from_string_013 {
public static void main(String[] args) {
	String s1="Ab2hishek12";
	char arr[]=s1.toCharArray();
	String s2="";
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>=48 && arr[i]<=57) {
				
		}else {
		s2=s2+arr[i];	
		}
	}
	
	System.out.println(s2);
}
}
