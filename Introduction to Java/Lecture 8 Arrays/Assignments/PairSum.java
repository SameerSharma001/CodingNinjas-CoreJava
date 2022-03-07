package Assignments;

import java.util.Scanner;

public class PairSum {
	public static int[] takeinput() {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}

    
       public static int pairsum(int arr[],int x) {
    	   int numPairs=0;
    	   for(int i=0;i<arr.length;i++) {
    		   for(int j=i+1;j<arr.length;j++) {
    			   if(arr[i]+arr[j]==x) {
    				   numPairs+=1;
    			   }
    		   }
    	   }
    	   return numPairs;
       }
       
       public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
		int arr[]=takeinput();
		int n=s.nextInt();
		System.out.println(pairsum(arr,n));
	}
}