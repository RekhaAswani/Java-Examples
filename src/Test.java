import java.util.*;
public class Test
{
 static boolean exists(int[] array, int k)
	{ 
		//int j = array.length;
	 for(int i=0;i<array.length;i++)
		{
			if (k == array[i])
			{
				return true;
			}
		}	
		return false;
	}// TODO Auto-generated method stu
	 public static void main(String args[])
	  {  
		 int [] ints = {7,14,37,102};
		 
		 //Test.exists(ints, 15);
		 
		 System.out.println(Test.exists(ints,14));
	  }	 
   }