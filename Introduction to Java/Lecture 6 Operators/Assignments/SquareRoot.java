package Assignments;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int output=0;
				while(output*output<=n) {
					output++;
				}
		output--;
		System.out.println(output);
	}
}
