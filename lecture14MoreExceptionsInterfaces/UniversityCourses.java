public class UniversityCourses {
	
	public static void main(String[] args) {
		Course course1 = new Course("cs112");
		course1.addStudent("Jennifer", 0, 3.8);
		course1.addStudent("Jake", 1, 3.5);
		course1.addStudent("Katherine", 2, 4.0);

		Course course2 = new Course("cs221");
		course2.addStudent("Aice", 3, 3.7);
		course2.addStudent("Pablo", 4, 3.7);

		System.out.println(course1.compareTo(course2));


	}
}