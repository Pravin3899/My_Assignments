package YMMethods;

public class Palindrom 
{
		public static void main(String[] args) {
			Checkno C1= new Checkno();
			C1.NumberPalindrom(45554); //argument
		}
}

class Checkno
{
	    void NumberPalindrom(int num)   //paraqmeters
	    {
	    	int revnum=0;
	        int x=num;
	        while(num>0)
	        {
	        	revnum=revnum*10+(num%10);
	        	num/=10;
	        }
	        System.out.println("Reversed numbers is:" + revnum);  
	        
	        if(x==revnum)
	        	System.out.println("Number is Palindrom");
	        else
	        	System.out.println("Number is not palindrom");
	        	
	    }
}
