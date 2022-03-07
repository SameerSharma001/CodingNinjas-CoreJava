import java.util.Scanner;

public class CharacterPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int k=65;
		while(i<=n) {
			int j=1;
			int start='A'+i-1;
			while(j<=i) {
				System.out.print((char)start);
				j++;
				start++;
			}
			System.out.println();
			i++;
		}
	}
}
