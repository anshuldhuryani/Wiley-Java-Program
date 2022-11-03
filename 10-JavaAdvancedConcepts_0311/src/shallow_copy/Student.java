package shallow_copy;

class Student implements Cloneable {
	int studentId;
	String studentName;
	Course course;
	public Student(int studentId, String studentName, Course course) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + "]";
	}
	
}
