import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int i = input.nextInt();

        System.out.print("Enter character: ");
        char c = input.next().charAt(0);

        System.out.print("Enter double: ");
        double d = input.nextDouble();

        Integer intObj = Integer.valueOf(i);
        Character charObj = Character.valueOf(c);
        Double doubleObj = Double.valueOf(d);

        System.out.println(" ");
        System.out.println("----Printing the values---- ");
        System.out.println(" ");
        System.out.println("Integer object: " + intObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Double object: " + doubleObj);

        input.close();
    }
}
