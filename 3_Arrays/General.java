import java.util.Scanner;

public class General {
    public static int[] inputArray(Scanner scr){
        int size;

        while(true){
            System.out.print("Input the size of array: ");
            size = scr.nextInt();

            if(size > 0) break;
            System.out.println("Invalid size. Please try again");
        }

        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.printf("Index %d element: ",i);
            arr[i] = scr.nextInt();
        }
        return arr;
    }
}
