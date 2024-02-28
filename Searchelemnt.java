import java.util.Scanner;

public class Searchelemnt {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original Array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int foundIndex = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element " + target + " found at index " + foundIndex + " in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
