import java.util.Scanner;

public class DiamondofStars {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int firsthalf=(n+1)/2;
		int secondhalf=n/2;
		int i=1;
		while(i<=firsthalf) {
			int spaces=1;
			while(spaces<=firsthalf-i) {
				System.out.print(" ");
				spaces++;
			}
			int j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		i=secondhalf;
		while(i>=1) {
			int spaces=1;
			while(spaces<=secondhalf-i+1) {
				System.out.print(" ");
				spaces++;
			}
			int j=1;
			while(i<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
