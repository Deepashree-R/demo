package Programs_50;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram_004 {
public static void main(String[] args) {
	String s1="Race";
	String s2="Care";
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	if(s1.length()==s2.length()) {
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean status=Arrays.equals(arr1, arr2);
		System.out.println(status+" it is a anagram");
	}
}
}
