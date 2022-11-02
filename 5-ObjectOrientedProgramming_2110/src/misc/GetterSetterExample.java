package misc;

class Student {
	private String name;
	private String course;
	private int age;
	private static String schoolName;
	static {
		Student.schoolName = "ABC School";
	}
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	// Getter
	public String getName() {
		return this.name;
	}
	// Setter
		public void setCourse(String course) {
			this.course = course;
		}
		// Getter
		public String getCourse() {
			return this.course;
		}
		// Setter
		public void setAge(int age) {
			if(age>=18) {
				this.age = age;
			} else {
				System.out.println("You can't get enrollment for this course.");
			}
		}
		// Getter
		public int getAge() {
			return this.age;
		}
		//Getter
		public String getSchoolName() {
			return Student.schoolName;
		}
	
}

public class GetterSetterExample {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("King Kochhar");
		student.setCourse("Java");
		student.setAge(12);
		System.out.println("Name: " + student.getName());
		System.out.println("Course: " + student.getCourse());
		System.out.println("Age: " + student.getAge());
		System.out.println("School Name: " + student.getSchoolName());
		

	}

}
