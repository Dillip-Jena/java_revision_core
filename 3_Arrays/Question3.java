//Statement
//Compute the sum of all array elements and then calculate its average

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void sumElementArray(int[] arr){
        int sum = 0;
        for(int element : arr){
            sum += element;
        }

        float average = (float)sum/arr.length;
        System.out.println("Average : " + average);
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int[] arr = General.inputArray(scr);
        System.out.println("\nArray: " + Arrays.toString(arr));

        sumElementArray(arr);

        scr.close();
    }
}
