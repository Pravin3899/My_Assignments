package YMMethods;

public class CllbyRef {
       
    	void addition(CllbyRef p)
		{
    		//p=60;
    		p.p=60;
			System.out.println("In ddition Method: "+p.p);
		}
    	
       	int p;   
    	public static void main(String[] args) {
    			CllbyRef Obj = new CllbyRef();
    			Obj.p=20;
    			System.out.println("Before clling ddition Method: "+Obj.p);	
    			Obj.addition(Obj);
    			System.out.println("In wggddition Method: "+Obj.p);	
    		}
}

