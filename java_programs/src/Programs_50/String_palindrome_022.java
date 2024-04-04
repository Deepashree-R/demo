package Programs_50;

public class String_palindrome_022 {
public static void main(String[] args) {
	String s1="Malayalam";
	String s2=s1.toLowerCase();
	String rev="";
	for(int i=s2.length()-1; i>=0; i--) {
		rev=rev+s2.charAt(i);			
	}
	System.out.println(rev);
	if(s2.equals(rev)) {
		System.out.println("String is a palindromde");
	}else {
		System.out.println("String is not a palindrome");
	}
}
}
