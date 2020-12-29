package YMMethods;

public class NumbersSwap {
		public static void main(String[] args) {
			Numbers obj = new Numbers();
			int x =5;
			int y =6;
			System.out.println("Numbers Before Swapping: "+x+","+y);
			obj.SwapNumberss(x, y);
		}
}
class Numbers
{
	void SwapNumberss(int a, int b)
	{
		int c=a;
		a=b;
		b=c;
		System.out.println("Numbers after swaping: "+a+","+b);
	}
}