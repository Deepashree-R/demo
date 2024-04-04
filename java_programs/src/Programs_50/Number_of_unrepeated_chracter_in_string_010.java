package Programs_50;

public class Number_of_unrepeated_chracter_in_string_010 {
public static void main(String[] args) {
	String s1="i am a good boy";
	char arr[]=s1.toCharArray();
	String s2="";
	int count=0;
	for(int i=0; i<arr.length; i++) {
		if(s2.indexOf(arr[i])==-1) {
			count++;
			s2=s2+arr[i];
		}
	}
	System.out.println(count);
}
}
