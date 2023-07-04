package udemuProtatip.entities;

public class Course extends Base{

	private int price;

	public Course(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
