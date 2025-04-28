import java.util.*;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(name + " - " + marks + " marks");
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 90),
            new Student("Charlie", 78)
        );

        // Sorting using Anonymous Inner Class
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getMarks(), s2.getMarks());
            }
        });

        System.out.println("Students sorted by marks:");
        for (Student s : students) {
            s.display();
        }
    }
}
