import java.util.Scanner;

public class AlphaPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int k=65;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print((char)k);
				j++;
			}
			System.out.println();
			k++;
			i++;
		}
	}
}
