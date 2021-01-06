package YMMethods;

class Test1
{
	static String year="Welcome 2021";
	
}

public class InstanceVar {
public static void main(String[] args) {
	Test1 t1 = new Test1();
	Test1 t2 = new Test1();
	Test1 t3 = new Test1();
	
	
	System.out.println(t1.year);
	System.out.println(t2.year);
	System.out.println(t3.year);	
	
	// Make some changes 
	
	t2.year="Welcome 2021. Happy new year!!";
	
	System.out.println(t1.year);
	System.out.println(t2.year);
	System.out.println(t3.year);
	
}
}
