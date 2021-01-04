package YMMethods;

class marks
{
	//Instnce varibles 
	int english; 
	int mths;
	int physics;
	int chemistry;
	static int stat;
}

public class Varibles {
        public static void main(String[] args) {
        	marks obj1 = new marks();
        	obj1.english=88;
        	obj1.mths=86;
        	obj1.physics=89;
        	obj1.chemistry=83;
        	System.out.println("Object 1 mrks re");
        	System.out.println(obj1.english);
        	System.out.println(obj1.mths);
        	System.out.println(obj1.physics);
        	System.out.println(obj1.chemistry);
        	
        	marks obj2 = new marks();
        	obj2.english=79;
        	obj2.mths=76;
        	obj2.physics=73;
        	obj2.chemistry=72;
        	System.out.println("Object 2 mrks re");
        	System.out.println(obj2.english);
        	System.out.println(obj2.mths);
        	System.out.println(obj2.physics);
        	System.out.println(obj2.chemistry);
        	
        	int sum=0;  // locl vrible
        	sum=obj1.english+obj1.chemistry;
        	System.out.println(sum);
        	
        	
			
		}
}
