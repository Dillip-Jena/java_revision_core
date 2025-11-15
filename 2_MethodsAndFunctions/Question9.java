//Statement
//Write a recursive method int factorial(int n)
//Example: 5! = 120

import java.util.Scanner;

public class Question9 {
    public static int factorial(int n){
        if(n==0 || n==1){
            return n;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scr.nextInt();

        System.out.printf("Factorial %d! = %d", num, factorial(num));

        scr.close();
    }
}
