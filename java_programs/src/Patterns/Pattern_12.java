package Patterns;

public class Pattern_12 {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=3; j++) {
				if(j==2) {
					System.out.print("*");
				}
					else if(j==1){
						System.out.print(i);
					}
					else {
						System.out.print(i+2);
					}
				}
			System.out.println();
			}
		
		}
	}

