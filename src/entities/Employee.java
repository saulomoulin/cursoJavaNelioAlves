package entities;

public class Employee {
	private String name;
	private Integer hours;
	private Double valuePoerHour;

	public Employee() {
	}

	public Employee(String name, Integer hours, Double valuePoerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePoerHour = valuePoerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePoerHour() {
		return valuePoerHour;
	}

	public void setValuePoerHour(Double valuePoerHour) {
		this.valuePoerHour = valuePoerHour;
	}

	public double payment() {
		return hours * valuePoerHour;
	}
}
