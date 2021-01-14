package YMMethods;

class Calcultor
{
	int addition(String str, int...a)
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum= sum+a[i];
		}
		System.out.println("Name & Sum is:"+str+" "+sum);
		return sum;
	}
}

public class Varargs {
    public static void main(String[] args) {
		Calcultor obj = new Calcultor();
		int ans;
		ans=obj.addition("Prvin is good:", 10,20,30,40,50,60,70,152,452,365,457);
		System.out.println("Sum is:"+ans);
	}
}
