import java.util.Scanner;
public class Evenoddnumbers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number to check");
		int a = sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Number is even");
				
		}	
		else
			
		{
			System.out.println("Number is odd");
		}
				
	}

}
