import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 students names and ids:");
        String a=s.next();
        int id1=s.nextInt();
        String b=s.next();
        int id2=s.nextInt();
        String c=s.next();
        int id3=s.nextInt();

        // Adding students to the ArrayList
        studentList.add(new Student(a,id1));
        studentList.add(new Student(b,id2));
        studentList.add(new Student(c,id3));

        // Sorting the ArrayList based on student names
        Collections.sort(studentList, Comparator.comparing(Student::getName));

        // Printing the sorted list
        System.out.println("Sorted student list:");
        for (Student student : studentList) {
            System.out.println(student);}
}
}
