package YMMethods;

class Human
{
	String name;
	double height;
	double weight;
	String color;
	
	void speak(String message)
	{
		System.out.println(message);		
	}
}


public class MethodExam {
	public static void main(String[] args) {
		Human H1 = new Human();
		H1.name="Pravin Girigosavi";
		H1.speak("Hello Vaibhav");
		H1.height= 3.4;
		H1.weight=68.9;
		H1.color="Fair";
		
		Human H2 = new Human();
		H2.name="Vaibhav";
		H2.speak("Hi Pravin");
		H2.height= 3.4;
		H2.weight=68.9;
		H2.color="Fair";
	}
}
