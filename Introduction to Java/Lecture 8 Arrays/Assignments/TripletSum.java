package Assignments;

import java.util.Scanner;

public class TripletSum {
	
	public static int[] takeinput() {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static int tripletSum(int arr[],int x) {
		int numtriplets=0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						numtriplets++;
					}
				}
			}
		}
		return numtriplets;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=takeinput();
		int n=s.nextInt();
		System.out.println(tripletSum(arr,n));
	}
}