package Practical;

public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1331;
		int reverse = 0;
		int actualnumber = num;
		int a =0;
		
		while(num!=0)
		{
			a=num%10;
			reverse=reverse*10+a;
			num=num/10;
			
		}
		System.out.println(" reverse number is " +reverse);
		if(actualnumber==reverse)
		{
			System.out.println(+actualnumber +" number is palindorm");
		}
		else
		{
			System.out.println(+actualnumber +" number is not palindorm");
		}

	}

}
