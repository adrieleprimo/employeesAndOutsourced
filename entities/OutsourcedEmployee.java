package entities;
public class OutsourcedEmployee extends Employee {
	private  Double addtionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additonalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = additonalCharge;
	}
	
	@Override
	public  final Double payment() {
		return super.payment() + addtionalCharge*1.1;
	}	
}
