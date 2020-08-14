public class employeeWageComputation
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Problem in Java");
		int isPresent=1;

        	int empCheck=(int)((Math.random()*10)%2);

        	if(isPresent==empCheck)
        	{
            		System.out.println("Employee is Present");
       		}
        	else
        	{
            		System.out.println("Employee is Absent");
        	}
	}
}

