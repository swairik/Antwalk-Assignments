public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private float experience;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	public void calculateMonthlySalary() {
		int variable = 0;
		if(experience < 3)	variable = 0;
		else if(experience < 5)	variable = 5;
		else if(experience < 10)	variable = 7;
		else	variable = 12;
		
		double sal = basicPay + hra + (basicPay * (variable / 100.0));
		setSalary(Math.round(sal));
	}
	
}
