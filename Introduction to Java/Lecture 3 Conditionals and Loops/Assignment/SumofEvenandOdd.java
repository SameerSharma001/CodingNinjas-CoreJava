package Assignment;

import java.util.Scanner;

public class SumofEvenandOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int evensum=0,oddsum=0;
		while(n>0) {
			int lastdigit=n%10;
			if(lastdigit%2==0) {
				evensum+=lastdigit;
			}
			else {
				oddsum+=lastdigit;
			}
			n/=10;
		}
		System.out.println(evensum+" "+oddsum);
	}

}
