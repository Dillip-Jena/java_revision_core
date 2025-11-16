//Statement
//Given an array, count how many times each element appears.

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void countFrequency(int[] arr){
        boolean[] visited = new boolean[arr.length];

        for(int i=0; i<arr.length; i++){
            if(visited[i]) continue;
            int counter = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    counter++;
                }
            }
            System.out.println(arr[i] + " appears " + counter + " times.");
        }
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int[] array = General.inputArray(scr);
        System.out.println("\nArray: " + Arrays.toString(array));

        countFrequency(array);

        scr.close();
    }
}
