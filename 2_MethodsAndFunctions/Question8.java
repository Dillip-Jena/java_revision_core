//Statement
//Create a method void printFibonacci(int n) that prints the first n Fibonacci numbers.

import java.util.Scanner;

public class Question8 {
    /*
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void printFibonacci(int n){
        for(int i=0; i<n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
        */

    public static void printFibonacci(int n){
        int a = 0;
        int b = 1;

        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Input number: ");
        int num = scr.nextInt();

        System.out.print("Fibonacci number: ");
        printFibonacci(num);

        scr.close();
    }
}
