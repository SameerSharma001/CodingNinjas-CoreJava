package Assignments;

import java.util.Scanner;

public class TermsofAP {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		int num=1,count=0;
		while(count<n) {	
			int res=3*num+2;
			if(res%4!=0) {
				System.out.print(res+" ");
			count++;
		}
		num++;
		}
	}
}
