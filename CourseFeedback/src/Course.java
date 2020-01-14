import java.util.ArrayList;

public class Course {

	private String name;
	private ArrayList<String>tips;
	
	public Course(String n) {
		this.name=n;
	}
	public void setName(String s) {
		this.name=s;
	}
	public String getName() {
		return this.name;
	}
	public ArrayList<String>getTips(){
		return this.tips;
	}
	public boolean equals(Object o) {
		if (this==o){
			return true;
		}
		if (o==null) {
			return false;
		}
		Course other = (Course)o;
		return ((this.tips.equals(other.tips))&& this.name.equals(other.name));
	}
}
