import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        
        Student st1 = new Student("Zack", 1, 3.5);
        Student st2 = new Student("Abigail", 2, 3.9);
        Student st3 = new Student("Bao", 3, 3.6);

        int result = st1.compareTo(st2);
        if (result == 0) {
            System.out.println("Students are considered equal, have the same ID");

        }
        else if (result < 0)
            System.out.println(" student " + st1.getName() + " has a smaller id than " + st2.getName());
        else
            System.out.println(" student " + st1.getName() + "has a larger id than " + st2.getName());
        

        /*
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        Collections.sort(students);
        System.out.println(students); */

    }
}
