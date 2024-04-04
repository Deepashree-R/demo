package java_programs;

public class resverse_string {
public static void main(String[] args) {
	String s1="Deepa";
	String s2=s1.toLowerCase();
	String rev="";
	for(int i=s2.length()-1; i>=0; i--) {
		rev=rev+s2.charAt(i);
	}
	System.out.println(rev);
}
}
