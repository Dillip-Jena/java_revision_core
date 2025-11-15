//Statement
//Write a method int sumDigits(int n)
//that returns the sum of digits of a number.
//Example: 123 -> 6

import java.util.Scanner;

public class Question3 {
    public static int sumDigits(int n){
        n = Math.abs(n);
        int sum = 0;

        while(n>0){
            sum += n%10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Input digits: ");
        int digits = scr.nextInt();

        System.out.println("Sum of Digits: " + sumDigits(digits));

        scr.close();
    }
}
