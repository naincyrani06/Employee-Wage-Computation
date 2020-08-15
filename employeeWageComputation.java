public class employeeWageComputation
{

	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static final int NUMBER_OF_WORKING_DAYS=20;

        public static void main(String[] args)
	{
                employeeWageComputation salary=new employeeWageComputation();
                salary.calculate20DayWage();
        }
        public void calculate20DayWage()
        {
                int Emp_Hour;
                int Emp_Wage;
                int totalEmpWage=0;
                int Maximum_Hour=50;
                int Total_Hour=0;
                int Total_Working_Days=0;

                while( Total_Hour<=Maximum_Hour  && Total_Working_Days<=NUMBER_OF_WORKING_DAYS )
                {
                        Total_Working_Days++;
                        int randomCheck=(int)(Math.random()*10)%3;
                switch(randomCheck)
			{
                        case IS_FULL_TIME:
                                Emp_Hour=8;
                                break;
                        case IS_PART_TIME:
                                Emp_Hour=4;
                                break;
                        default:
                                Emp_Hour=0;
                	}
                Total_Hour=Total_Hour+Emp_Hour;
                }
                totalEmpWage=Total_Hour*EMP_RATE_PER_HOUR;
                System.out.println("Total Employee Hour : "+Total_Hour);
                System.out.println("Total Employee Wages : " +totalEmpWage);
        }
}
