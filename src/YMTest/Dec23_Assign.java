package YMTest;

public class Dec23_Assign {
	//Print numbers in reverse order ex. 123 will be 321

	public static void main(String[] args) {
		
	       int num= 135, rev=0;
	       while(num>0)
	       {
		      rev=rev*10+(num%10);
	    	  num/=10;
	       }	    
	    System.out.println(rev);
	    
	}

}
