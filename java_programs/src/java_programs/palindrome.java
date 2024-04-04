package java_programs;

public class palindrome {
public static void main(String[] args) {
	int num=151;
	int temp=num;
	int rev=0;
	while(num!=0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;	
	}
	if(rev==temp)
	{
		System.out.println("the number is palindrome");
	}
	else
	{
		System.out.println("the number is not a palindrome");
	}
}
}
