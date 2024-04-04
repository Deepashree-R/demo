package Programs_50;

public class Sum_of_natural_no_recurssion_051 {
//public static int sum(int n) {
//	if(n>=1) {
//	int sum=n+sum(n-1);
//		return sum;
//	}else {
//		return n;
//	}
//}
	public static void main(String[] args) {
		System.out.println(sum(100));
	}
	public static int sum(int n) {
		if(n==0) {
			return n;
		}
		else {
			int sum=n+sum(n-1);
			return sum;
		}
	}

}
