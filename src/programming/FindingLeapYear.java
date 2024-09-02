package programming;

public class FindingLeapYear 
{
	 public static boolean isLeapYear(int year) 
	    {
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	public static void main(String[] args) 
	{
		 int startYear = 1890;
	        int endYear = 1910;

	        System.out.println("Leap years between " + startYear + " and " + endYear + ":");
	        for (int year = startYear; year <= endYear; year++) {
	            if (isLeapYear(year)) {
	                System.out.println(year);
	            }
	        }
	    }


	}


