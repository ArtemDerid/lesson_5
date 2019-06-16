package ua.lviv.lgs.salary;

public class HourlyPaidWorker implements Salary {

	private int numberOfHours;
	private double ratePerHour;
	private double salary;

	public HourlyPaidWorker(int numberOfHours, double ratePerHour) {
		super();
		this.numberOfHours = numberOfHours;
		this.ratePerHour = ratePerHour;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void salary() {
		this.salary = numberOfHours * ratePerHour;
		System.out.println("hourly paid worker gets " + salary+ "$ per month");
	}

}
