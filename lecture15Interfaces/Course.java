import java.util.ArrayList;

public class Course implements Comparable<Course> {
	private String courseTitle;
	private ArrayList<Student> students;

	public Course(String courseTitle) {
		this.courseTitle = courseTitle;
		students = new ArrayList<>();
	}

	public void addStudent(String name, int id, double gpa) {
		Student st = new Student(name, id, gpa);
		students.add(st);
	}

	public int compareTo(Course otherCourse) {
		// FILL IN  CODE

		return 0; // change
	}


}