package Programs_50;

public class Factorial_recurtion_050 {
//	public static int fact(int n) {
//		if(n>=1) {
//			int fact=n*fact(n-1);
//			return fact;
//		}else {
//			return 1;
//		}
//	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}else {
			int fact=n*fact(n-1);
			return fact;
		}
		
	}
}
