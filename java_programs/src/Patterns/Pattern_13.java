package Patterns;

public class Pattern_13 {
	public static void main(String[] args) {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i==j) {
					System.out.print("@"+" ");
				}else {
					System.out.print("_"+" ");
				}
			}
			System.out.println();
		}
	}

}
