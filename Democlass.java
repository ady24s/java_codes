public class Democlass {
    private int value;

    public Democlass() {
    }

    public Democlass(int value) {
        this.value = value;
    }

    public Democlass(Democlass other) {
        this.value = other.value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {

        Democlass object1 = new Democlass();
        Democlass object2 = new Democlass(10);
        Democlass object3 = new Democlass(object2);

        System.out.println("Default Constructor \nObject 1 Value: " + object1.getValue());
        System.out.println(" ");

        System.out.println("Parameterized Constructor \nObject 2 Value: " + object2.getValue());
        System.out.println(" ");

        System.out.println("Copy Constructor\nObject 3 Value: " + object3.getValue());
        System.out.println(" ");

    }
}
