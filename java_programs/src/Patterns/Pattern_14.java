package Patterns;

public class Pattern_14 {
public static void main(String[] args) {
	for(int i=1; i<=4; i++) {
		int n=1;
		for(int j=1; j<=4; j++) {
			if(i==j) {
				System.out.print("@"+" ");
			}else {
				System.out.print(n+" ");
				n++;
			}
		}
		System.out.println();
	}
}
}
