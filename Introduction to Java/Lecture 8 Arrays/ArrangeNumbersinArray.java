import java.util.Scanner;

public class ArrangeNumbersinArray{

		public static int[] takeInput() {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i < n;i++) {
				arr[i] = s.nextInt();
			}
			return arr;
		}
		
		public static void printArray(int[] arr) {
			for(int i = 0;i < arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
		}
		public static int[] arrange(int n){
			
	  int left = 0,right = n-1,counter = 1;
	      int[] arr = new int[n]; 
	      for(counter = 1; counter <= n ;counter++){
	        if(counter % 2 != 0) {
	        arr[left] = counter;
	        left++;
	        }
	        else {
	        arr[right] = counter;
	        right--;}
	      }
	      return arr;

		}

		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = arrange(n);
		printArray(arr);

		}

		}
