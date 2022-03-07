package Assignments;
import java.util.Scanner;

public class CheckArrayRotation {
	
	public static int[] takeinput() {
		Scanner s=new Scanner(System.in);
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

	public static int checkrotation(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return (i+1);	
			}
		}
			return 0;
	}
		
		public static void main(String args[]) {
			int arr[]=takeinput();
			int ans=checkrotation(arr);
			System.out.println(ans);
	}
}
