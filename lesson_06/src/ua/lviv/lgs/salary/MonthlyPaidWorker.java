package ua.lviv.lgs.salary;

public class MonthlyPaidWorker implements Salary {

	private double salary;

	public MonthlyPaidWorker(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void salary() {
		System.out.println("monthly paid worker gets " + getSalary() + "$ per month");

	}

}
