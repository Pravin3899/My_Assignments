package YMMethods;

public class Factorial {
	int no;
	public static void main(String[] args) {
		Factorial f1= new Factorial();
		f1.no=58;
		int f;
		f=f1.fact(f1);
		System.out.println("Factorial of number using Call by reference is: "+f);
	}
	
	int fact(Factorial no)
	{
		int sum=1;
		no.no=9;
		while(no.no>0)
		{
			sum=(no.no*sum);
            no.no--;		
		}
		return sum;
	}

}
