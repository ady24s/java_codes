public class Hierarchy {
    public static void main(String[] args) {
        SecondYear sy = new SecondYear();
        sy.setName("Adya");
        sy.setPRN(1);
        sy.setSubjects(5);
        sy.displayS();

        ThirdYear ty = new ThirdYear();
        ty.setName("Aarya");
        ty.setPRN(2);
        ty.setSubjects(3);
        ty.displayT();
    }
}

class Student {
    private String name;
    private int PRN;
    private int subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPRN() {
        return PRN;
    }

    public void setPRN(int PRN) {
        this.PRN = PRN;
    }

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }
}

class SecondYear extends Student {
    private String elective = "German / French";

    public void displayS() {
        System.out.println("Name: " + getName());
        System.out.println("PRN: " + getPRN());
        System.out.println("Number of subjects: " + getSubjects());
        System.out.println("Options for elective subjects: " + elective);
    }
}

class ThirdYear extends Student {
    private int PBL = 2;

    public void displayT() {
        System.out.println(" ");
        System.out.println("Name: " + getName());
        System.out.println("PRN: " + getPRN());
        System.out.println("Number of subjects: " + getSubjects());
        System.out.println("Number of subjects with Project Based Learning: " + PBL);
    }
}
