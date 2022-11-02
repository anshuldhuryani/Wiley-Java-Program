package generics;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	public abstract void drawShape();
}

class Square extends Shape {
	@Override
	public void drawShape() {
		System.out.println("Drawing Square Here..");
	}

}

class Rectangle extends Shape {
	@Override
	public void drawShape() {
		System.out.println("Drawing Rectangle Here..");
	}

}

public class GenericWithWildCardExample {

	public static void drawing(List<? extends Shape> shapeList) {
		for (Shape shape :shapeList) {
			shape.drawShape();
		}
	}

	public static void main(String[] args) {

		List<Square> listOne = new ArrayList<Square>();
		listOne.add(new Square());
		listOne.add(new Square());
		listOne.add(new Square());
		listOne.add(new Square());
		
		drawing(listOne);
		
		List<Rectangle> listTwo = new ArrayList<Rectangle>();
		listTwo.add(new Rectangle());
		listTwo.add(new Rectangle());

		drawing(listTwo);
		
	}

}
