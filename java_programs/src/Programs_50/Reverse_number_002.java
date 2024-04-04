package Programs_50;

public class Reverse_number_002 {
public static void main(String[] args) {
	int num=256;
	int rev=0;
	while(num!=0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev);
}
}
