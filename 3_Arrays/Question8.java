//Statement
//Without sorting the full array, find the second largest number.

import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    public static int secondLargest(int[] arr){
        if(arr.length < 2){
            throw new IllegalArgumentException("Array contains atleast 2 elements.");
        }

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        
        for(int e : arr){
            if(e > largest){
                second_largest = largest;
                largest = e;
            }else if(e<largest && e>second_largest){
                second_largest = e;
            }
        }

        if(second_largest == Integer.MIN_VALUE){
            throw new IllegalArgumentException("No second largest element exists.");
        }

        return second_largest;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int[] array = General.inputArray(scr);
        System.out.println("\nOriginal Array: " + Arrays.toString(array));

        System.out.println("Second largest element in array: " + secondLargest(array));

        scr.close();
    }
}
