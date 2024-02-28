class Student {
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Course {
    private int id;
    private String title;
    private int teacherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}

class Teacher {
    private int id;
    private String name;
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class SchoolSystem {

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1001);
        student.setName("Jane Doe");
        student.setEmail("jane.doe@example.com");

        Teacher teacher = new Teacher();
        teacher.setId(5001);
        teacher.setName("Dr. Smith");
        teacher.setDepartment("Mathematics");

        Course course = new Course();
        course.setId(2001);
        course.setTitle("Algebra 101");
        course.setTeacherId(teacher.getId());

        System.out.println("---STUDENT MANAGEMENT SYSTEM---");
        System.out.println(" ");

        System.out.println("Student: " + student.getName() + ", Email: " + student.getEmail());
        System.out.println("Teacher: " + teacher.getName() + ", Department: " + teacher.getDepartment());
        System.out.println("Course: " + course.getTitle() + ", Taught by Teacher ID: " + course.getTeacherId());

        System.out.println(" ");
    }
}
