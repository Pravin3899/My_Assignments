package YMTest;

public class Plindrom {
	public static void main(String[] args) {
		
		int num=1100011; int rev =0;
		int x=1100011;
		
		
		while (num>0)
		{
			int rem = num%10;
			rev = (rev * 10) + rem;
			num/=10;
			
		}
		
		
		System.out.print("\n Enterned Number is:" +x);
		
		System.out.print("\n Reversed Number is:" +rev);
		
		if(x==rev)
		{
			System.out.println("\n Enterned number is Palindrom");
		}
		else
		{
			System.out.println("\n Enterned number is not Palindrom");
		}
		
		
	}

}
