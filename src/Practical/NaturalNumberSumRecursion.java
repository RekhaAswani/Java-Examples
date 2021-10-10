package Practical;

public class NaturalNumberSumRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =20;
		int sum =addNum(20);
		System.out.println(sum);

	}

	public static int addNum(int num)
	{
		if(num!=0)
		{
			 return num = num+addNum(num-1);
		}
		
		else 
		{
			return num;
		}
	}
}
