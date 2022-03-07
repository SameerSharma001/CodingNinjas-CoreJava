import java.util.Scanner;

public class CodeInsertionSort {
		
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
		
		public static void insertion(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
		public static void main(String[] args) {
			int arr[]=takeinput();
			insertion(arr);
			printArray(arr);
		}
}
