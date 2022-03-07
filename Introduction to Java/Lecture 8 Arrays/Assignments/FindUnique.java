package Assignments;

import java.util.Scanner;

public class FindUnique {
	
	public static int[] takeinput() {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
	}	
	return arr;
}

	
	public static int findUnique(int[] arr){
        int i,j,c;
        for(i=0;i<arr.length;i++){
            c=0;
            for(j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    c++;
            }
            if(c==1)
            {
                return arr[i];
            }
        }
        return 0;
	}
		public static void main(String[] args) {
			int arr[]=takeinput();
			int a=findUnique(arr);
			System.out.println(a);
		}
	}