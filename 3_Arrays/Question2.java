//Statement
//Count Even and Odd Numbers in Array

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {    
    public static void countEvenOddElement(int[] arr){
        int evenCount = 0;
        int oddCount = 0;

        for(int element : arr){
            if(element%2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.printf("Even numbers: %d\nOdd numbers: %d\n",evenCount, oddCount);
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int[] arr = General.inputArray(scr);

        System.out.println("\nArray: " + Arrays.toString(arr));
        countEvenOddElement(arr);

        scr.close();
    }
}
