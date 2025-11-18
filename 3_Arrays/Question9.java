//Statement
//Given a sorted array, remove duplicates and print the new array size & elements.

import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static int[] newArray(int[] arr){
        if(arr.length == 0) return new int[0];

        //initialize pointer
        int pointer = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[j] != arr[pointer]){
                pointer++;
                arr[pointer] = arr[j];
            }
        }

        return Arrays.copyOfRange(arr,0, pointer+1);
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int[] arr = General.inputArray(scr);
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        System.out.println("New Array: " + Arrays.toString(newArray(arr)));

        scr.close();
    }
}
