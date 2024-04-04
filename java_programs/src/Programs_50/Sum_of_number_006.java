package Programs_50;

public class Sum_of_number_006 {
public static void main(String[] args) {
	int num=326;
	int sum=0;
	while(num!=0) {
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	System.out.println(sum);
}
}
