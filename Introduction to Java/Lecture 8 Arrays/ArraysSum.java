import java.util.Scanner;

public class ArraysSum {
	
	public static int arraysum(int arr[]) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans+=arr[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int a=arraysum(arr);
		System.out.println(n);
	}
}
