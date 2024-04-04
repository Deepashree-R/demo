package java_programs;

public class remove_duplicate_letters {
public static void main(String[] args) {
	String s1="deepashree";
	char arr[]=s1.toCharArray();
	String s2="";
	for(int i=0; i<arr.length; i++) {
	if(s2.indexOf(arr[i])==-1)
	{
	s2=s2+arr[i];	
	}
	}
	System.out.println(s2);
}
}
