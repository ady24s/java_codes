import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;
    char grade;

    public Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getter methods for the properties
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }
}

class StudentDatabase {
    private List<Student> students;

    public StudentDatabase() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        // Check for duplicate IDs before adding
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("Student with ID " + student.getId() + " already exists.");
                return;
            }
        }
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    public void removeStudent(int studentId) {
        students.removeIf(s -> s.getId() == studentId);
        System.out.println("Student with ID " + studentId + " removed.");
    }

    public void displayStudents() {
        for (Student s : students) {
            System.out.println(s.id + ", " + s.name + ", " + s.grade);
        }
    }
}

public class ArrayList2 {
    public static void main(String[] args) {
        StudentDatabase db = new StudentDatabase();

        db.addStudent(new Student(1, "Alice", 'A'));
        db.addStudent(new Student(2, "Bob", 'B'));
        db.addStudent(new Student(3, "Charlie", 'C'));

        db.addStudent(new Student(1, "David", 'D'));

        System.out.println("\nStudents after additions:");
        db.displayStudents();

        db.removeStudent(2);

        System.out.println("\nStudents after removal:");
        db.displayStudents();
    }
}
