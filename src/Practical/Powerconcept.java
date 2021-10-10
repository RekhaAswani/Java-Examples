package Practical;

public class Powerconcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base =3;
		int exponent =4;
		long result = 1;
		
		while(exponent!=0)
		{
			result *=base;
			--exponent;
		}
    System.out.println(result);
	}

}
