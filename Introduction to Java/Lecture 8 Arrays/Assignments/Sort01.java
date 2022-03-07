package Assignments;

import java.util.Scanner;

public class Sort01 {
	public static int[] takeinput() {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sort01(int arr[]) {

		int nextZero=0;
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]==0) {
				int temp=arr[nextZero];
				arr[nextZero]=arr[i];
				arr[i]=temp;
				nextZero+=1;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]=takeinput();
	    sort01(arr);
		printArray(arr);
	}
}
