//Statement
//Reverse the array in-plcae using swapping logic.
//Example: {1, 2, 3, 4} -> {4, 3, 2, 1}

import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int[] arr = General.inputArray(scr);
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        System.out.println("Reversed Array: " + Arrays.toString(reverseArray(arr)));

        scr.close();
    }
}
