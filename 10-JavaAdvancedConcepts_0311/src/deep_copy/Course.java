package deep_copy;

class Course implements Cloneable {
	String subjectOne;
	String subjectTwo;
	String subjectThree;
	public Course() { }
	public Course(String subjectOne, String subjectTwo, String subjectThree) {
		super();
		this.subjectOne = subjectOne;
		this.subjectTwo = subjectTwo;
		this.subjectThree = subjectThree;
	}
	public String getSubjectOne() {
		return subjectOne;
	}
	public void setSubjectOne(String subjectOne) {
		this.subjectOne = subjectOne;
	}
	public String getSubjectTwo() {
		return subjectTwo;
	}
	public void setSubjectTwo(String subjectTwo) {
		this.subjectTwo = subjectTwo;
	}
	public String getSubjectThree() {
		return subjectThree;
	}
	public void setSubjectThree(String subjectThree) {
		this.subjectThree = subjectThree;
	}
	@Override
	public String toString() {
		return "Course [subjectOne=" + subjectOne + ", subjectTwo=" + subjectTwo + ", subjectThree=" + subjectThree
				+ "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
