package YMTest;

public class Fibonan {
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int d=5;
		System.out.println(a);
		System.out.println(b);
		for(int l=0;l<=d;l++)
		{ 
			//int c= a +  b;
			//System.out.println(c);
			//a=b;
			//b=c;
			
			//int c= a +  b;
			//1,1
			a=b;   
			b=a+b; // 
			System.out.println(a); 
			//
			
		}
		
	}
	
}
