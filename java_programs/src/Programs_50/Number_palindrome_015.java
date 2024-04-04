package Programs_50;

public class Number_palindrome_015 {
public static void main(String[] args) {
	int num=153;
	int rev=0;
	int temp=num;
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(rev==temp) {
		System.out.println("number is palindrome");
	}else {
		System.out.println("Number is not a palindrome");
	}
	
}
}
