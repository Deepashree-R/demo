package Programs_50;

public class Prime_number_016 {
public static void main(String[] args) {
	int num=4;
	boolean flag=true;
	for(int i=2; i<num/2; i++) {
		if(num%i==0) {
			flag=false;
			break;
		}
		if (flag==true) {
		System.out.println("prime num");
		}
		else {
			System.out.println("not prime num");
		}
	}
}
}
