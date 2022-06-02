package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] number = {10,30,15,20,70,55,43,1,2,4,5};
        // sort
        Arrays.sort(number);
        // arrays to String
        System.out.println(Arrays.toString(number));

        // arrays binary search
        System.out.println(Arrays.binarySearch(number, 10 ));
        System.out.println(Arrays.binarySearch(number, 20 ));
        System.out.println(Arrays.binarySearch(number, 99 ));

        // arrays copy
        int[] result = Arrays.copyOf(number, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(number, 5, 10);
        System.out.println(Arrays.toString(result2));

    }
}
