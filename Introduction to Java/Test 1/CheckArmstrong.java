import java.util.Scanner;

public class CheckArmstrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int digit=0,num=n;
		while(num>0) {
			digit++;
			num/=10;
		}
		
		int newnum=0;
		num=n;
		while(num>0) {
			int lastdigit=num%10;
			newnum+=Math.pow(lastdigit,digit);
			num/=10;
		}
		if(newnum==n) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
