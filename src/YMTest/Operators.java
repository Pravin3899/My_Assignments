package YMTest;

public class Operators {
	public static void main(String[] args) {
		
		int i=15;
		//int j = ++i + i++ +  ++i + --i   - ++i  +  --i + i--;
	
		//      21   +  21  +  23 + 22  - 23  + 22  + 22
		
		
		int d = ++i  + i++  +  --i   +  --i +   i--;
		//     16    +  16  +  16   +  15  +  15
		
		//System.out.println(j);
		//System.out.println(i);
		System.out.println(d);
	}

}
