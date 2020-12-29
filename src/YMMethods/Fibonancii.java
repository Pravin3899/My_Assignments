package YMMethods;

public class Fibonancii 
{
	public static void main(String[] args) 
	{
		Number num = new Number();
		num.FBSeries(0, 1);
	}
}

class Number
{
	void FBSeries(int a, int b)
	{
		System.out.println(a); System.out.println(b);
		int r = 4;
		for(int j=0; j<=r; j++)
				{
			         //int c=a;
			         a=a+b;
			         b=b+a;
			                   //c=a+b;
			                   //System.out.println(c);
			                   //a=b;
			                   //b=c;
			         System.out.println(a);
			         System.out.println(b);
				}
	}
}
