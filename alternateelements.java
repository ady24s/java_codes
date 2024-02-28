public class alternateelements {
    public static void main (String[] args){
        int[]arr1 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original Array");
        for (int i=0; i< arr1.length;i++ ){
            System.out.println(arr1[i]);
        }

        System.out.println("Alternate elements");

        System.out.println("Even Index");
        for (int i =0; i<arr1.length; i+=2){
            System.out.println(arr1[i]);
        }

        System.out.println("Odd Index");
        for (int i = 1; i < arr1.length; i += 2) {
            System.out.println(arr1[i]);
        }

    }

}
