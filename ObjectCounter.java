public class ObjectCounter {
    private static int count = 0;

    public ObjectCounter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();
        System.out.println(" ");

        System.out.println("Number of objects created: " + ObjectCounter.getCount());

        System.out.println(" ");

    }
}
