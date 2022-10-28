package assessment;

class Car {
	
	private int speed;
	private double regularPrice;
	private String color;

	public Car(int Speed, double regularPrice, String color) {
		this.speed = Speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	public double getSalePrice() {
		return regularPrice;
	}
}