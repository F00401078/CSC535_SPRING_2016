
public class driver 
{
	public static void main(String[] args)
	 	
	 {
		 int a=0;
		 int b=0;
		 int c=0;
		 int d=0;
		 
		 for (int i=2;i <1000000; i=i+1)
		 {
			 
			 if (i%9==0)
			 {
				 a=a+1;
			 }
			 if (i%13==0)
			 {
				 b=b+1;
			 }
			 if (i%27==0)
			 {
				c=c+1;
			 }
			 if (i%81==0)
			 {
				 d=d+1;
			 }
			 
	}
		 int sum = a+b+c+d;
		 int total = a+b;
		 System.out.println("The total count of numbers divided by 9 between 1 and million is " + a);
		 System.out.println("The total count of numbers divided by 13 between 1 and million is " + b);
		 System.out.println("The total count of numbers divided by 27 between 1 and million is " + c);
		 System.out.println("The total count of numbers divided by 81 between 1 and million is " + d);
		 System.out.println("The total sum of numbers divided by 9, 13, 27 & 81 between 1 and million is " + sum);
		 System.out.println("The total count of numbers divided by all 9, 13, 27 & 81 between 1 and million is " + total);	 
	 }
}
