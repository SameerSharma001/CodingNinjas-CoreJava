package Assignments;

import java.util.Scanner;

public class ReverseofaNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int revnum=0;
		int i=n;
		while(i>0) {
			int lastdigit=i%10;
			revnum=revnum*10+lastdigit;
			i=i/10;
		}
		System.out.print(revnum);
	}
}
