import java.util.Scanner;

public class LinearSearch {
	
	public static int[] takeinput() {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	return arr;
}
	
	public static int linearsearch(int arr[],int n) {
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				return i;
			}
		}
			return -1;
		}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=takeinput();
		int n=s.nextInt();
		int a=linearsearch(arr,n);
		System.out.println(a);
	}
}
