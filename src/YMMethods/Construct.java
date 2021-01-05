package YMMethods;
public class Construct {
   public static void main(String[] args) {
	H h1 =new H();
	H h5 =new H();
	H h2 =new H(10,2);
	H h3=new H(13,2);
	// instantiation(plot area) |  constructor
   }  
}

class H{
	// non parameterised (default) 
	H()
	{
		System.out.println("default constructor");
	}

	H(int i,int j)
	{
		System.out.println("one parameterized constructor:"+(i+j));
	}

	// method 
	void call() {
	System.out.println("i am call method");	
	}	
}