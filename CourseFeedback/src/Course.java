
public class Course {

	private String name;
	private int course_index;
	
	public Course(String n,int i) {
		this.name=n;
		this.course_index=i;
	}
	public void setName(String s) {
		this.name=s;
	}
	public String getName() {
		return this.name;
	}
	public void setIndex(int i) {
		this.course_index=i;
	}
	public int getIndex() {
		return this.course_index;
	}
}
