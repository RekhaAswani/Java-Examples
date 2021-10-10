package Practical;

public class FactorialRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multiplyNum(5));
		System.out.println(multiplyNum(0));
	}

	public static int multiplyNum(int Num)
	{
		if(Num>1)
		{
			return Num*multiplyNum(Num-1);
			
		}
		else
		{
			return 1;
		}
	}
}
