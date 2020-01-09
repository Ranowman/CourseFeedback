
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
	public boolean equals(Object o) {
		if (this==o){
			return true;
		}
		if (o==null) {
			return false;
		}
		Course other = (Course)o;
		return ((this.course_index==other.course_index)&& this.name.equals(other.name));
	}
}
