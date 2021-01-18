package YMMethods;

public class SumOfOddEve {
	public static void main(String[] args) {
		SumOfOddEve obj = new SumOfOddEve();
		obj.sumeveodd(10);
		
		
	}
	
	void sumeveodd(int no)
	{
		int sume=0;
		int sumo=0;
		while(no>0)
		{
			if(no/2==0)
			{
				sume= sume + no;
			}	
			else 
			{
			    sumo=sumo + no;
			}
			no--;
		}
		System.out.println("Sum of Even numbers till 10 is: "+sume);
		System.out.println("Sum of Odd numbers till 10 is: "+sumo);
	}
}	

	

