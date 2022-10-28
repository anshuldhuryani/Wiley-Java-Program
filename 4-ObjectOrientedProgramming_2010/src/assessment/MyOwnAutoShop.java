package assessment;


public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		// Truck myTruck = new Truck(160, 30000, "Blue", 200);
		
		Sedan mySedan = new Sedan(160, 20000, "Red", 10);
		Ford myFord1 = new Ford(156, 4452.0, "Black", 2005, 10);
		Ford myFord2 = new Ford(155, 5000.0, "Pink", 1998, 5);
		Car myCar = new Car(555, 56856.0, "Red");
		System.out.printf("\nMySedan Price: %.2f", mySedan.getSalePrice());
		System.out.printf("\nMyFord1 Price: %.2f", myFord1.getSalePrice());
		System.out.printf("\nMyFord2 Price: %.2f", myFord2.getSalePrice());
		System.out.printf("\nMyCar Price:  %.2f", myCar.getSalePrice());
	}
}