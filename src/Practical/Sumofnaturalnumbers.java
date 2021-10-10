package Practical;

public class Sumofnaturalnumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =5;
		int sum=0;
		int sum1 = 0;
		
		for(int i=0;i<=10;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum of number " +sum);
		
		System.out.println("*********************");
		
		int k=1;
		while(k<=num)
		{
			sum1=sum1+k;
			k++;
		}
		System.out.println("sum of number " +sum);
	}
	
}
