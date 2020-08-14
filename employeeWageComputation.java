public class employeeWageComputation
{
	public static void main(String[] args)
	{
		int fullTimeEmp=1;
        	int empRatePerHour=20;
		int empHrs = 0;
        	int empWage=0;
        	int randomCheck=(int)((Math.random()*10)%2);
        	if(fullTimeEmp==randomCheck)
		{
			empHrs = 8;
		}
		empWage=empHrs*empRatePerHour;
		System.out.println("Employee Wage is : " + empWage);
	}
}

