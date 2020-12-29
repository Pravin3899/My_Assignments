package YMTest;

public class SumNumbers {

	   public static void main(String[] args)
	   {
	   int a=55;
	   int b=a/10;
	   int rem=a%10;
	   int sum=b+rem;
	   System.out.println(sum);
	   
	   
	   int x= 130;
	   int y= 300;
	   byte n = (byte) x;
	   byte m = (byte) y;
	   
	   System.out.println(n);
	   System.out.println(m);
	   
	   
	   char i=65;
	   System.out.println(i);
	   
	   
	   
	   
	   int num=4565;
	   int f, summ=0;
	   while(num>0)
	   {
		  f=num%10;
		  summ=summ+f;
		  num=num/10;
	   }
	   System.out.println(summ);
	   
	   
	   
	   
	   }

}
