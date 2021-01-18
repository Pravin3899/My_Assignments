package YMMethods;

public class CllbyRef {
  	    
	int p;   // instance variable 
    	void addition(CllbyRef p)
		{
    		//p=60;
    		p.p=60;
			System.out.println("In addition Method: "+p.p);
		}
    
    	public static void main(String[] args) {
    			CllbyRef Obj = new CllbyRef();
    			Obj.p=20;
    			System.out.println("Before calling addition Method: "+Obj.p);	
    			Obj.addition(Obj);
    			System.out.println("After calling addition Method: "+Obj.p);	
    		}
}

