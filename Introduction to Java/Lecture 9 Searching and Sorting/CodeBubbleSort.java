import java.util.Scanner;

public class CodeBubbleSort {
	
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
		
		public static void bubblesort(int arr[]) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
		
		public static void main(String[] args) {
			int arr[]=takeinput();
			bubblesort(arr);
			printArray(arr);
		}
}
