package Practical;
public class Reverseanumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n =1234;
   
    int reverse=0;
  while(n!=0)
  {
	  int a=n%10;
	  
	  reverse=reverse*10+a;
	  
	  n=n/10;
  }
  System.out.println("reversed number is: " +reverse);
	}

}
