package Assignments;

import java.util.Scanner;

public class CheckNumberSequence {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int prev=s.nextInt();
		int current;
		int count=2;
		boolean isdec=true;
		while(count<=n) {
			current=s.nextInt();
			count++;
			if(current==prev) {
				System.out.println("false");
				return;
			}
			if(current<prev) {
				
			}
			else {
				if(isdec ==true) {
				}
				
			}
			System.out.println("true");
		}
	}
}
