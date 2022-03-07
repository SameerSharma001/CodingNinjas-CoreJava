import java.util.Scanner;

public class CodeBinarySearch {
	
	public static int[] takeinput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static int binarysearch(int arr[],int num) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]>num) {
				end=mid-1;
			}else if(arr[mid]<num) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=takeinput();
		int n=s.nextInt();
		int a=binarysearch(arr,n);
		System.out.println(a);
	}
}