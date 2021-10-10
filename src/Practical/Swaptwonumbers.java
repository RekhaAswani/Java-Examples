package Practical;
public class Swaptwonumbers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b= 10;
		System.out.println("Before swapping:");
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		
		a = a+b; //15
		b = a-b; //5
		a= a-b;  //10
		
		System.out.println("After swapping:");
		System.out.println("a= " +a);
		System.out.println("b= " +b);
				
	}

}
