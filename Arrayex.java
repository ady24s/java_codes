public class Arrayex {
    public static void main (String[] args){
        int[]arr1 = {1,2,3};

        System.out.println("Original Array");
        for (int i=0; i< arr1.length;i++ ){
            System.out.println(arr1[i]);
        }

        System.out.println("Reversed Array");
        for (int i= arr1.length - 1; i>=0 ; i--){
            System.out.println(arr1[i]);

        }

    }

}
