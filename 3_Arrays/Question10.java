//Statement
//Left rotate an array by 1 positon
//Example: {1, 2, 3, 4, 5} -> {2, 3, 4, 5, 1}

import java.util.Arrays;
import java.util.Scanner;

public class Question10 {
    public static int[] rotateArray(int[] arr){
        int first = arr[0];

        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = first;

        return arr;
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int[] arr = General.inputArray(scr);
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        System.out.println("Rotated Array: " + Arrays.toString(rotateArray(arr)));

        scr.close();
    }
}
