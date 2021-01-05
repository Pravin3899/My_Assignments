package YMMethods;
class Calculate
{
	public static int addition(int a, int b)
	{
			return (a+b);
	}

	public static int substraction(int a, int b)
	{
		return a-b;
		//System.out.println("hi");
		//new 
	}

	public static int multipliction(int a, int b)
	{
		return a*b;
	}
	public static double division(double a, double b)
	{
		if(a==0 & b==0) {
			System.out.println("\nEntered vlues are zeros");
			return 0;
		}else if(b==0) {
			System.out.println("\nCan not divide by 0");
			return 0;
		}
		else {
			return a/b;
		}
	}
	public static int square(int a) {
		return multipliction(a, a);
	}
	public static int cube(int a) {
		return multipliction(square(a), a);
	}
	
}

public class Calculator {
	public static void main(String[] args) {
		Calculate.addition(0, 0);
		Calculate.substraction(12, 45);
		Calculate.multipliction(12, 5);
		Calculate.division(5, 0);
//		Calculate.mod(0, 0);	
	}
}
