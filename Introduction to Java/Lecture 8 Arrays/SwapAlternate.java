import java.util.Scanner;

public class SwapAlternate {
	
	public static int[] takeinput() {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
	}	
	return arr;
}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void swapAlternate(int arr[]) {
		for(int i=0;i<arr.length-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[]=takeinput();
		swapAlternate(arr);
		printArray(arr);
	}
}
