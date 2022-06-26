package linkedlist;
import java.util.Scanner;
public class linearsearch {
	
	public static int linearsearch(int arr[],int x) {
		int len = arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		 return-1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int input[] = new int[size];
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++) {
			System.out.print(input[i]+" ");
		}
		
		int  x = sc.nextInt();
		int result=linearsearch(input,x);
		System.out.println(result);
		
	}

}
