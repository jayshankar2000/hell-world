package recursion;

public class primenum {
	public static int prime(int n) {
	    if(n<=2) {
	    	return n;
	    }
	    if(n%prime(n-1)==0) {
	    	
	    }
	    System.out.print("%d"+n);
	    return prime(n-1);
	    
	}
 public static void main(String[] args) {
	prime(10);
}
 
}
