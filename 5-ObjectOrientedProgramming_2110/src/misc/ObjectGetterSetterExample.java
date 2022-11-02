package misc;

import java.util.ArrayList;
import java.util.List;

class UserCollection {
	
	private List<String> users;

	public List<String> getUsers() {
		return users;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}
	
}

public class ObjectGetterSetterExample {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Kartik Sharma");
		names.add("King Kochhar");
		names.add("Shreya Sharma");
		names.add("Sarah Bowling");
		
		UserCollection obj = new UserCollection();
		// Setting User Collection
		obj.setUsers(names);
		// Getting User Collecti9on
		for (String name : obj.getUsers()) {
			System.out.println(name);
		}
		
		
	}

}
