package ua.lviv.lgs.salary;

public class Application {

	public static void main(String[] args) {
		
		MonthlyPaidWorker monthlyPaidWorker = new MonthlyPaidWorker(2000);
		monthlyPaidWorker.salary();
		
		HourlyPaidWorker hourlyPaidWorker = new HourlyPaidWorker(160, 13.5);
		hourlyPaidWorker.salary();

	}

}
