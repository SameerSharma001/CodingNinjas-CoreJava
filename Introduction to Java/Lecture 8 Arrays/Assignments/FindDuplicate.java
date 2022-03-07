package Assignments;

import java.util.Scanner;

public class FindDuplicate {
	
	public static int[] takeinput() {
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	return arr;
}
	
	public static int duplicate(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int c=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					c++;
			}
			if(c==2) {
				return arr[i];
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int arr[]=takeinput();
		int a=duplicate(arr);
		System.out.println(a);
	}
}
