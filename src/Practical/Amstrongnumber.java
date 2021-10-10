package Practical;

public class Amstrongnumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int number =371;
   int actualnumber =number;
   double sum =0;
   while(number!=0)
   {
	   int a=number%10;
	   sum= sum+Math.pow(a,3);//similar to a*a*a
	   
	   number=number/10;
   }
   System.out.println("sum is " +sum);
   
   if(actualnumber==sum)
   {
	   System.out.println("number is amstrong mumber " +sum);
	   
   }
   else
   {
	   System.out.println("number is not amstrong mumber " +sum);
   }
	}

}
