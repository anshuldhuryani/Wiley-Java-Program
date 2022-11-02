package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<String> vectorList = new Vector<String>();

		vectorList.addElement("King");
		vectorList.addElement("Kochhar");
		vectorList.addElement("Sarah");
		vectorList.addElement("John");
		vectorList.addElement("King");
		vectorList.addElement("Kochhar");
		vectorList.addElement("Sarah");
		vectorList.addElement("John");
		vectorList.addElement("King");
		vectorList.addElement("Kochhar");
		vectorList.addElement("Sarah");
		vectorList.addElement("John");

		System.out.println("Vector Elements: " + vectorList);
		System.out.println("Size of Vector: " + vectorList.size());
		System.out.println("Capacity of Vector: " + vectorList.capacity());

		// To Iterate the Vector Elements:
		Enumeration<String> enumeration = vectorList.elements();
		System.out.println("Vector Elements are: ");
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		System.out.println("Vector Elements are:");
		Iterator<String> iterator = enumeration.asIterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

	}

}
