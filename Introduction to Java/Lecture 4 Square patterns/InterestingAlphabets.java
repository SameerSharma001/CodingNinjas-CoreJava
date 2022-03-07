import java.util.Scanner;

public class InterestingAlphabets {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int num=n;
		while(i<=n) {
			int j=1;
			int start='A'+num-1;
			while(j<=i) {
				System.out.print((char)start);
				start++;
				j++;
			}
			System.out.println();
			num--;
			i++;
		}
	}
}
