import java.util.Scanner;

public class TriangleofNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int j;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(" ");
				spaces++;
			}
			j=1;
			int value=i;
			while(j<=i) {
				System.out.print(value);
				value++;
				j++;
			}
			value=value-2;
			int l=1;
			while(l<=i-1) {
				System.out.print(value);
				l++;
				value--;
			}
			System.out.println();
			i++;
		}
	}

}
