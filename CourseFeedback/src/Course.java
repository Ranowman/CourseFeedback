import java.util.ArrayList;

public class Course {

	private String name;
	private ArrayList<String>tips;
	
	public Course(String n) {
		this.name=n;
		tips=new ArrayList<String>();
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
	public String printTips() {
		String s="";
		for (String t: this.tips) {
			s+=t+"\n";
		}
		return s;
	}
	
	public boolean addTips(String s) {
		if (tips.contains(s)) {
			return false;
		}
		tips.add(s);
		return true;
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
