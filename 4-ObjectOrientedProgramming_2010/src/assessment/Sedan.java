package assessment;

class Sedan extends Car {
	private int length;

	public Sedan(int Speed, double regularPrice, String color, int length) {
		super(Speed, regularPrice, color);
		this.length = length;
	}

	public double getSalePrice() {
		if (length > 20) {
			return super.getSalePrice() - (0.05 * super.getSalePrice());
		} else {
			return super.getSalePrice() - (0.1 * super.getSalePrice());
		}
	}
}