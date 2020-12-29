package YMMethods;

class sum
{
       void sumnumber(int num)  // parameters
       {
    	   int sumn =0;
    	   while(num>0)
    	   {
    		   sumn=sumn+(num%10);
    		   num/=10;
    	   }
    	   System.out.println(sumn);
       }
}

public class NumberSum 
{
		public static void main(String[] args) {
			sum s1 = new sum();
			s1.sumnumber(5588);
		}
}
