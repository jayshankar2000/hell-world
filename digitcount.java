package recursion;
import java .util.Scanner;
public class digitcount {
   
	public static int countd(int n) {
	
		if(n==0) {
			return 0;
		}
        	int ans = countd(n/10);
	    return ans = ans+1;
	    
	    		
	}
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 int result = countd(num);
	 System.out.println(result);
}
}
