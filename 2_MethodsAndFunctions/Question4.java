//Statement
//Create a function int reverse(int n) and return the reversed number.
//Example: 456 -> 654

import java.util.Scanner;

public class Question4 {
    public static int reverse(int n){
        int reverse = 0;
        while(n>0){
            int last_digit = n%10;
            reverse = reverse * 10 + last_digit;
            n /= 10;
        }

        return reverse;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scr.nextInt();

        System.out.println("Reverse of number: " + reverse(num));

        scr.close();
    }
}
