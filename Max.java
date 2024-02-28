public class Max {
    public static void main (String[] args){
        int[]arr1 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original Array");
        for (int i=0; i< arr1.length;i++ ){
            System.out.println(arr1[i]);

        }

        int max = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }

        System.out.println("Maximum Element: " + max);

    }
}
