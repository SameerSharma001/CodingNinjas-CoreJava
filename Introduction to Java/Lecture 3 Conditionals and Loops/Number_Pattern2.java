import java.util.Scanner;
public class Number_Pattern2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j=j+1;
			}
			int k=1;
			int value=i;
			while(k<=i) {
				System.out.print(value);
				value=value+1;
				k=k+1;
			}
			System.out.println();
			i=i+1;
		}
	}
}
