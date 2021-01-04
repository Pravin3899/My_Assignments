package YMMethods;

class Test
{
	Test()
	{
		System.out.println("This is Test Class");
	}
}


class Leap extends Test
{
	//int year = 2000;
	Leap(){ System.out.println("This is Leap Class");  }
	
	Leap(int year)
	{
		//super();
		this();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("Entered year is leap year");
		}
		else
			System.out.println("Entered Yer is not leap year");
	}
}


public class LeapYear {
       public static void main(String[] args) {
		Leap L1 = new Leap(1991);
	}
}
