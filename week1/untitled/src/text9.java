//hanhatquang20205116
//6.5	Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.
import java.util.Arrays;
public class text9 {
    public static void main(String[] args){

        int[] arr = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        System.out.println("Original numeric array : "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted numeric array : "+Arrays.toString(arr));
        int sum = 0; // initialize sum
        int i;

        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        double avg =  (double) sum/i  ;

        // Driver method

        System.out.println("Sum of given array is " + sum);
        System.out.println("Avg of given array is " + avg);



    }
}