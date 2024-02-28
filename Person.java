public class Person {
    private int age;

    public Person() {
        this.age = 0;
    }

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void yearPasses() {
        this.age += 1;
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(5);
        System.out.println("Age: " + person.getAge());
        person.amIOld();
        person.yearPasses();
        System.out.println("New Age: " + person.getAge());
        person.amIOld();
    }
}
