public class employeeWageComputation
{
	public static void main(String[] args)
	{
		int fullTimeEmp=1;
		int partTime=2;
		int empRatePerHour=20;
		int empHrs = 0;
		int empWage=0;
		int randomCheck=(int)((Math.random()*10)%3);
		if(fullTimeEmp==randomCheck)
		{
			empHrs = 8;
		}
		else if (partTime==randomCheck)
		{
			empHrs = 4;
		}
		empWage =empHrs*empRatePerHour;
		System.out.println("Employee Wage: " + empWage);
	}
}

