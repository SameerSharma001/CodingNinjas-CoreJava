import java.util.Scanner;

public class ZerosandStarsPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int start=1,mid=n+1,end=2*n+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n+1;j++) {
				if(j==start || j==end || j==mid) {
					System.out.print("*");
				}else {
					System.out.print('0');
				}
			}
			start++;
			end--;
			System.out.println();
		}
	}
}
