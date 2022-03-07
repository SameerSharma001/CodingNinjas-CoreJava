package Assignments;

import java.util.Scanner;

public class ArrayIntersection {
	
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
		
		public static void print(int arr[]) {
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]+" ");
			}
		}
		
	public static void arrayintersection(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]+" ");
					arr2[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr1[]=takeinput();
		int arr2[]=takeinput();
	    arrayintersection(arr1,arr2);
	    }
	}
}
