package Programs_50;

public class convert_upper_to_lower_012 {
public static void main(String[] args) {
	String s1="My Name is Arun";
	char arr[]=s1.toCharArray();
	String s2="";
	for(int i=0; i<s1.length(); i++) {
		if(arr[i]>=65 && arr[i]<=90) {
		arr[i]=(char)(arr[i]+32);
		}else if(arr[i]>=97 && arr[i]<=122) {
			arr[i]=(char) (arr[i]-32);
		}
	}
	System.out.println(arr);	
}
}
