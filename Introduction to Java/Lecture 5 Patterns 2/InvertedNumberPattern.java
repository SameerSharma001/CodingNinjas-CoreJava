import java.util.Scanner;

public class InvertedNumberPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=n-i+1;
			int val=j;
			while(j>0) {
				System.out.print(val);
				j--;
			}
			System.out.println();
			i++;
		}
	}
}
