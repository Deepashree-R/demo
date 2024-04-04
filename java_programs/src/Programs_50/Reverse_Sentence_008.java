package Programs_50;

public class Reverse_Sentence_008 {
public static void main(String[] args) {
	String s1="Hello i am a good boy";
	String arr[]=s1.split(" ");
	String rev="";
	for(int i=arr.length-1; i>=0; i--) {
		rev=rev+arr[i]+" ";
	}
	System.out.println(rev);
}
}
