import java.util.Scanner;

public class FahrenheitToCelsiusTable {
	
	public static void fahtocel(int start,int end,int w) {
		for(int i=start;i<=end;i+=w) {
			int cel=((i-32)*5)/9;
			System.out.println(i+"\t"+cel);
		}
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int w=s.nextInt();
		
		fahtocel(start,end,w);
	}
}
