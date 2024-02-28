public class ParameterizedMethods {

    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 40;
        System.out.println(" ");

        System.out.println("Before calling parameterized function:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        newValues(num1, num2);
        System.out.println(" ");

        System.out.println("After calling parameterized function:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void newValues(int a, int b) {
        a = a * 2;
        b = b + 5;
        System.out.println(" ");

        System.out.println("Changing values in the function:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
