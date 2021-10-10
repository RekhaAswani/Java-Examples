package Practical;
public class NumberofDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num =253;
       int count=0;
       while(num!=0) //253 25/ 2
       {
    	   num=num/10;
    	   ++count;
    	   
       }
       System.out.println("number of digits are: " +count);
	}
	

}
