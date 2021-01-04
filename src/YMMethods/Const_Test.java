package YMMethods;

class Demo
{
	Demo()
	{ System.out.println("Im m in Demo"); }
}
public class Const_Test extends Demo
{
	Const_Test() 
    { System.out.println("This is default"); 
    } 
  
	Const_Test(int x) 
    { 
        //this(); 
		super();
        System.out.println("One Parameterized: "+x); 
    } 
 
	Const_Test(int x, int y) 
    {
        this(5); 
        System.out.println("Two Parameterized: " +(x * y)); 
    } 
  
    public static void main(String args[]) 
    { 
    	
    	new Const_Test(8); 
    	//new Const_Test(8, 10); 
    } 
} 
