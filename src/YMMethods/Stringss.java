package YMMethods;

public class Stringss {
	public static void main(String[] args) {
		String Str1="Welcome to Java language";
		String Str2="Welcome To Java language";
		//Java compiler will create only one object & assigns both reference to the string for above two Strings
		
		String Str3 = new String("Happy new new year");
		System.out.println(Str3.charAt(11));
		for(int i=0;i<Str2.length();i++)
		{
			System.out.print(Str2.charAt(i));
		}
		System.out.println();
		
		if(Str1.equals(Str2))
		{
			System.out.println("String 1 & String 2 are equal Strings");
		}
		if(Str1.equalsIgnoreCase(Str2))
		{
			System.out.println("String 1 & String 2 are equal Strings");
		}
		if(Str1.equals(Str3))
		{
			System.out.println("String 1 & String 3 are equal Strings");
		}
		else
			System.out.println("String 1 & String 3 are not equal Strings");
		
		
		int Vr=Str1.compareTo("Welcome To Java language");
		System.out.println(Vr);	
		
		int Vrr=Str1.compareToIgnoreCase("Welcome To Java language");
		System.out.println(Vrr);	
		
		
		char ch='y';
		System.out.println(Str3.indexOf(ch));
		System.out.println(Str3.indexOf("new"));
		System.out.println(Str3.lastIndexOf("new"));
		System.out.println(Str3.lastIndexOf(ch));
		
		
		System.out.println("----------------------------------------------------");
		String substr = new String("new"); 
		int b = Str3.lastIndexOf(substr);
		System.out.println(b);
		int l = Str3.length();
		System.out.println(l);
		
		String str = new String("This is my first java program");
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 10));
		
		
		String s9="Beginners";
		s9= s9.concat("Book").concat(".").concat("com");
		System.out.println(s9);
		
		String s12 = "YuktaMedia";
		s12= s12.concat(" LLP").concat(" Baner").concat(" Pune");
		System.out.println(s12);
		
		
		System.out.println("----------------------------------------------------");
		String demo = "Welcome to testing";
		System.out.println(demo.replace('o', 'k'));
		System.out.println(demo.replaceFirst("to", "toooo"));
		
		System.out.println(demo.toUpperCase());
		System.out.println(demo.toLowerCase());
		
		if(demo.isEmpty())
		{
			System.out.println("String is empty");
		}
		else 
			System.out.println("String is not empty");
		
		
	}

}
