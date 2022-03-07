package Assignments;

import java.util.Scanner;

public class DecimaltoBinary {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int binary=0,power=1;
		while(num>0) {
			int lastdigit=num%2;
			binary+=lastdigit*power;
			power*=10;
			num/=2;
		}
		System.out.println(binary);
	}
}
