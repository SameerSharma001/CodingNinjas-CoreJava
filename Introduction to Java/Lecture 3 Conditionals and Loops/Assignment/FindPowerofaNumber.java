package Assignment;

import java.util.Scanner;

public class FindPowerofaNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int pow=s.nextInt();
		int ans=1;
		while(pow>0) {
			ans=ans*num;
			pow--;
		}
		System.out.println(ans);
	}
}
