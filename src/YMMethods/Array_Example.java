package YMMethods;

public class Array_Example {
       public static void main(String[] args) {
		   int[] values = {40,10,80,30,20,56,50,70,60};
    	   //int marks[] = new int[10];
		   for(int i=0; i<values.length; i++)
		   {
			   for(int j=i+1; j<values.length; j++)
			   {
				   if(values[i]>values[j])
				   {
					   int k=values[i];
					   values[i]=values[j];
					   values[j]=k;
				   }
				   
			   }
		   }
		   
		   for(int i=0; i<values.length; i++)
		   {
			   System.out.println(values[i]);
		   }
		
	}
}
