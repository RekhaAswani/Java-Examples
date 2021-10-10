package Practical;
public class LeapYear {

	public static void main(String[] args) {
		// divisible by 4 for all the century year---ending wiht 00
		// century year is leap year only its perfectly divisble by 400
        // 1900 is not leap year
		// 2012 leap year
		
		int year = 2012;
		boolean leap = false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap =true;
				}
				else
				{
					leap = false;
				}
			}
			else
			{
				leap = true;
			}	
		}
		else
		{
			leap = false;
		}
	
		if(leap)
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
	}
}
