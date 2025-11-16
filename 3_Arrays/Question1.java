//Statement
//Find the largest and smallest element

import java.util.Arrays;
import java.util.Scanner;

public class Question1{
    public static void smallestAndLargestElement(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int largest  = Integer.MIN_VALUE;

        for(int element : arr){
            if(smallest > element) smallest = element;
            if(largest < element) largest = element;
        }

        System.out.printf("Smallest element: %d\nLargest element: %d\n", smallest, largest);
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int[] arr = General.inputArray(scr);

        System.out.println("\nArray: " + Arrays.toString(arr));
        smallestAndLargestElement(arr);

        scr.close();
    }
}