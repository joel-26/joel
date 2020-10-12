package employee;
import java.util.Scanner;
public class Tax 
{
	  private static Scanner sc;
	private static double tax;
	private static int month;

	public static void main(String[] args) {
		double it;
		String name=null;
		int date=0,year=0;
		month = 0;
		sc = new Scanner(System.in);
		System.out.println("name:"+name);
		name=sc.next();
		System.out.println("date of birth");
		date=sc.nextInt();
		System.out.println("month of birth");
		month=sc.nextInt();
		System.out.println("year of birth");
		year=sc.nextInt();
		System.out.println("enter income");
		it=sc.nextDouble();
		
		if(it <= 200000 )
			tax=0;
		else if(it<=300000)
			tax=0.1*(it-200000);
		else if(it<=500000)
			tax=(0.2*(it-300000))+(0.1*100000);
		else if(it<=100000)
			tax=(0.3*(it-500000))+(0.2*200000)+(0.1*100000);
			else
				tax=(0.4*(it-100000))+(0.3*200000)+(0.2*200000)+(0.1*100000);
		System.out.println("income tax amount is"+tax);
	}

}
