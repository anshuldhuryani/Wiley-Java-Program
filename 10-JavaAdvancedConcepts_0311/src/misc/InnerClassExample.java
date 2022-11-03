package misc;

class Brand {
	protected String brandName;
	private void show() {
		System.out.println("Brand Details");
	}
	class Product {
		String productName;
		float productPrice;
		public float getProductPrice() {
			return 2000;
		}
		public void display() {
			show();
			System.out.println(brandName);
		}
	}
	protected class AnotherProduct {
		String productDesc;
		int productQuantity;
		public int getProductQuantity() {
			return 10;
		}
	}
}

public class InnerClassExample {

	public static void main(String[] args) {
		
		Brand brand = new Brand();
		
		Brand.Product product = brand.new Product();
		
		Brand.AnotherProduct anotherProduct = brand.new AnotherProduct();
		
		System.out.println(product.getProductPrice());
		product.display();
		System.out.println(anotherProduct.getProductQuantity());
		
		
	}
	
}
