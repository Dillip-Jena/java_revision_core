//Statement
//Create a method int maxOfThree(int a, int b, int c)
//that returns the largest number.

import java.util.Scanner;

public class Question2 {
    public static int maxOfThree(int a, int b, int c){
        return (a>=b) && (a>=c) ? a : (b>=c) ? b : c;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Input first number: ");
        int n1 = scr.nextInt();
        System.out.print("Input second number: ");
        int n2 = scr.nextInt();
        System.out.print("Input third number: ");
        int n3 = scr.nextInt();

        System.out.printf("\nLargest number is %d.", maxOfThree(n1, n2, n3));

        scr.close();
    }
}
