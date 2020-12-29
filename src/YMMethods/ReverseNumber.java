package YMMethods;

public class ReverseNumber {
    public static void main(String[] args) 
    {	
    	Two demo = new Two();
		demo.reverse(4654, "Pravin Girigosavi");  // arguments 
    }
}

class Two {	
	void reverse(int rev, String name)   //parameters
	{
	System.out.println(name);
	int rev_num = 0;
	while (rev > 0) {
		rev_num = rev_num * 10 + (rev % 10);
		rev = rev / 10;
	}
	    System.out.println(rev_num);
    }
}
