package Assignments;

import java.util.Scanner;

public class BinarytoDecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int decimal=0,power=1;
		while(num>0) {
			int lastdigit=num%10;
			decimal+=lastdigit*power;
			power*=2;
			num/=10;
		}
		System.out.println(decimal);
	}
}
