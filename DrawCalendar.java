import java.util.Scanner;

public class LG2_AQ1 {

	public static void drawCalendar(int year, int firstDay)
	{
		
		char ch=' ';
		int dayCounter=0;
		System.out.println("\nCALENDAR OF JANUARY " +year);
		System.out.println("\nSUN MON TUE WED THU FRI SAT");
		System.out.println("\n---------------------------");
		
		for(int i=0; i<firstDay-1; i++)
			System.out.printf("%4c", ch);
		
		for(int j=1; j<=31; j++)
		{
			System.out.printf("%4d", j);
			if((dayCounter+firstDay)%7==0)
				System.out.println();
			dayCounter++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=2018;
		Scanner input=new Scanner(System.in);
		
		while (year<=2021)
		{
			
			System.out.println("\nEnter the first day of " +year);
			int firstDay=input.nextInt();
			
			drawCalendar(year, firstDay);
			
			year++;
			
		}
		
	}

}
