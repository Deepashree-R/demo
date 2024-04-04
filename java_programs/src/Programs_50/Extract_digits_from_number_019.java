package Programs_50;

public class Extract_digits_from_number_019 {
public static void main(String[] args) {
	int num=568;
	while(num!=0) {
		int rem=num%10;
		System.out.println(rem);
		num=num/10;
	}
}
}
