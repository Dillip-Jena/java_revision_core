//Statement
//Create a new array containing only even numbers from the original.

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
    public static int[] evenArray(int[] arr){
        int count = 0;
        for(int element : arr){
            if(element%2==0){
                count++;
            }
        }

        int[] even = new int[count];
        int index = 0;
        for(int e : arr){
            if(e%2==0){
                even[index] = e;
                index++;
            }
        }

        return even;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int[] arr = General.inputArray(scr);
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        System.out.println("Even array: " + Arrays.toString(evenArray(arr)));

        scr.close();
    }
}
