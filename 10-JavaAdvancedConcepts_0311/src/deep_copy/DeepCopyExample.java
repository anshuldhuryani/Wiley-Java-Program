package deep_copy;

public class DeepCopyExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Course course1 = new Course("Java", "C++", "Database");
		Student student1 = new Student(1001, "Smith", course1);
		Student student2 = null;
		
		student2 = (Student) student1.clone();
		
		System.out.println(student1);
		System.out.println(student2);
		
//		student1.course.subjectOne = "Core Java";
//		
//		System.out.println(student1.course.getSubjectOne());
//		System.out.println(student2.course.getSubjectOne());
//		
		student2.course.subjectTwo = "Advance C++";
		
		System.out.println(student1.course.getSubjectTwo());
		System.out.println(student2.course.getSubjectTwo());

	}

}
