package by.htp_gvozdev.gift.bean;

public abstract class Production {
	private String name;
	private String type;
	private double cost;
	private int weight;
	private double consSuga;

	public Production(String name, String type, double cost, int weight, double consSuga) {
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.weight = weight;
		this.consSuga = consSuga;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getType() {

		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCost() {

		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getWeight() {

		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Production that = (Production) o;

		if (Double.compare(that.cost, cost) != 0)
			return false;
		if (weight != that.weight)
			return false;
		if (name != null ? !name.equals(that.name) : that.name != null)
			return false;
		return type != null ? type.equals(that.type) : that.type == null;

	}

	public double getConsSuga() {
		return consSuga;
	}

	public void setConsSuga(double consSuga) {
		this.consSuga = consSuga;
	}

}
