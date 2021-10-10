package Practical;
public class Stringsplit2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="This is Mumbai";

		String [] array = s.split(" ");
		
		String result = "";
		
		for (String word: array)
		{
			result = word +" "+result; 
		}
		
		System.out.print(result);
	}

}
