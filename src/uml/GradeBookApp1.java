/*
Step 1: Basic object and Offer relationship
* in a course grading system, please find out the Classes
  and identify their attributes, operations
* the main code is good way to find the possible classes
  , attributes and operations.
* in this step we only model the "offer" relationship,
  which is a 1-* relatipship.
* the 1-* is implemented by a simple array. I know it is
  not good. Later version will be good.  
*/

public class GradeBookApp1 {
	public static void main(String args[]) {
		Student Jie = new Student ("Jie");
		Student Albert = new Student ("Albert");

		Teacher Nick = new Teacher ("Nick");

		Course Java = new Course ("Java", 3);
		Course Python = new Course ("Python", 3);

		Nick.offer(Java); //++++++++++
		Nick.offer(Python); //++++++++++
		Nick.showCourse(); //++++++++++
	}
	
}

class Course {
	String cName;
	private int degree;
	public Course (String name, int degree) {
		this.cName = name;
		this.degree = degree;
	}
}

class Teacher {
	String tName;
	private String email;	
	Course[] courses = new Course[10];
	int couseCount = 0;
	public Teacher(String name) {
		this.tName = name;
	}
	public void setEmail(String e) {
		this.email = e;
	}	
	public void offer(Course c) { //++++++++++
		courses[couseCount++] = c;
	}
	
	public void showCourse() { //++++++++++
		for (Course c: courses) {
			if (c != null)
				System.out.println(c.cName);
			else 
				break;
		}
	}
}

class Student {
	String sName;
	private String email;
	public Student (String name){
		this.sName = name;
	}
	public void setEmail(String e) {
		this.email = e;
	}	
}