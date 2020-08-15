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
                //Local Variable
                int emp_Hour;
                int emp_Wage;
                int totalEmpWage=0;
                for (int day=1; day<=NUMBER_OF_WORKING_DAYS; day++ )
                {
                        int randomCheck=(int)(Math.random()*10)%3;
                        switch(randomCheck)
			{
                                case IS_FULL_TIME:
                                        emp_Hour=8;
                                        break;
                                case IS_PART_TIME:
                                        emp_Hour=4;
                                        break;
                                default:
                                        emp_Hour=0;
                        }
                        emp_Wage=emp_Hour*EMP_RATE_PER_HOUR;
                        totalEmpWage=totalEmpWage+emp_Wage;
                        System.out.println("Employee Wage : "+emp_Wage);
                }
                System.out.println("Total Employee Wage : " +totalEmpWage);
        }
}
