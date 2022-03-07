package Assignments;

import java.util.Scanner;

public class SumorProduct {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
//		if(c==1) {
//			int sum=0;
//			for(int i=1;i<=n;i++) {
//				sum=sum+i;
//			}
//			System.out.println(sum);
//		}
//		else if(c==2) {
//			int mul=1;
//			for(int i=1;i<=n;i++) {
//				mul=mul*i;
//			}
//			System.out.println(mul);
//		}
//		else
//			System.out.println("-1");
		if(c==1) {
			int i=1,sum=0;
			while(i<=n) {
				sum=sum+i;
				i++;
			}
			System.out.println(sum);
		}
		else if(c==2) {
			int i=1,mul=1;
			while(i<=n) {
				mul=mul*1;
				i++;
			}
			System.out.println(mul);
		}
		else
			System.out.println("-1");
	}
}
