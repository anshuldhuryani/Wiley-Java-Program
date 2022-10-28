package misc;

import java.util.ArrayList;
import java.util.List;

class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}	
	
}

class Client {
	List<Person> pList = new ArrayList<Person>();
	public List<Person> getpList() {
		return pList;
	}
	public void setpList(List<Person> pList) {
		this.pList = pList;
	}
}
public class ObjectEntityGetterSetterExample {
	public static void main(String[] args) {
//		Person p1 = new Person("Kartik");
//		System.out.println(p1);
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("King"));
		list.add(new Person("Kochhar"));
		list.add(new Person("Sarah"));
		list.add(new Person("Bowling"));
		
		Client client = new Client();
		client.setpList(list);
		for (Person person : client.getpList()) {
			System.out.println(person);
		}
		
		
		
	}

}
