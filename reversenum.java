package recursion;
import java.util.Scanner;
public class reversenum {
	public static int revn(int n) {
		if(n==0) {
			return 0;
		}
		int sum =0;
		int rem= n%10;
	 	
	      System.out.print(rem+" ");
	      
		 return revn(n/10);
		 
	}
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int num =sc.nextInt();
	  revn(num);
	 
}
}
