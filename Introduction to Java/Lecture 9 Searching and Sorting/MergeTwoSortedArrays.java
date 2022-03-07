import java.util.Scanner;

public class MergeTwoSortedArrays {
	
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
	
	public static int[] merge(int arr1[],int arr2[]) {
		int store[]=new int[arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				store[k]=arr1[i];
				i++;
				k++;
			}else {
				store[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			store[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			store[k]=arr2[j];
			j++;
			k++;
		}
		return store;
	}
	
	public static void main(String[] args) {
		int arr1[]=takeinput();
		int arr2[]=takeinput();
		int arr3[]=merge(arr1,arr2);
		printArray(arr3);
	}
}
