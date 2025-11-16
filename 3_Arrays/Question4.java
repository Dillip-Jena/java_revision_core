//Statement
//Ask the user for a number and check if it exists in the array.
//Print "Found" or "Not Found".

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void numberExist(int[] arr, int num){
        boolean flag = false;
        for(int element : arr){
            if(element == num){
                flag = true;
                break;
            }
        }

        System.out.println(flag ? "Found" : "Not Found");
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int[] arr = General.inputArray(scr);
        System.out.println("\nArray: " + Arrays.toString(arr));

        System.out.print("Input number: ");
        int num = scr.nextInt();
        numberExist(arr, num);

        scr.close();
    }
}
