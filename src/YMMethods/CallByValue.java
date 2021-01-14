package YMMethods;

public class CallByValue {
	
	
	//static void UpdteX(int x)
			int addition(int x, int y)
			{
				x=50;
				y=80;
				System.out.println("In ddition Method: "+x+" "+y);
				return(x+y);
			}
	
	public static void main(String[] args) {
		int x=10;
		int y=20;
		CallByValue Obj = new CallByValue();
		int sum;
		System.out.println("Before clling to ddition method: "+x+" "+y);
		sum=Obj.addition(x,y);
		System.out.println("fter clling to ddition method: "+x+" "+y);
		//UpdteX(10);
		System.out.println("In Disply Method: "+sum);
	}
	    
}


