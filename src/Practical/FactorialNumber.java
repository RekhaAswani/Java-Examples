package Practical;

public class FactorialNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  fact = Factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
	
	public static int Factorial(int n)
	{
		if (n == 0 )    
		    return 1;    
		  else    
		    return(n * Factorial(n-1));    
		 }    
	}


