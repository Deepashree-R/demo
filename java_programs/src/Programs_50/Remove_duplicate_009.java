package Programs_50;

public class Remove_duplicate_009 {
public static void main(String[] args) {
	String s1="My name is Khan";
	char arr[]=s1.toCharArray();
	String s2="";
	for(int i=0; i<arr.length; i++) {
		if(s2.indexOf(arr[i])==-1) {
			s2=s2+arr[i];
		}
	}
	System.out.println(s2);
}
}
