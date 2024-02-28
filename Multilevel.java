public class Multilevel {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        faculty.displayInstitute();
        faculty.setID(101);
        faculty.displayFaculty();
        GuestFaculty guestFaculty = new GuestFaculty();
        guestFaculty.setID(100);
        guestFaculty.displayGuestFaculty();
    }
}

class Institute {
    String name = "SIT";

    void displayInstitute() {
        System.out.println("Institute Name is " + name);
    }
}

class Faculty extends Institute {
    private int ID;
    int courseID = 2200;
    String className = "JAVA";

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    void displayFaculty() {
        System.out.println("Faculty ID " + getID());

    }
}

class GuestFaculty extends Faculty {

    void displayGuestFaculty() {

        System.out.println("Guest Faculty ID " + getID());
        System.out.println("Course ID " + courseID);
        System.out.println("Class taught " + className);
    }
}
