package java_programs;

public class count_no_of_words_in_string {
public static void main(String[] args) {
	String s="sky is beautiful";
	String arr[]=s.split(" ");
	int count=0;
	for(int i=0; i<arr.length; i++) {
		count++;
	}
	System.out.println(count);
}
}
