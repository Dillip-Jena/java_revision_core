//Statement
//Write a method boolean isArmstrong(int n) and test it inside main for multiple numbers.

import java.util.Scanner;

public class Question5 {
    public static boolean isArmstrong(int n){
        int original_num = n;

        int sum = 0;
        while(n>0){
            int last_digit = n%10;
            sum += Math.pow(last_digit, 3);
            n /= 10;
        }

        return (original_num == sum);
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scr.nextInt();

        System.out.print(isArmstrong(num) ? "Is Armstrong." : "Not an Armstrong.");

        scr.close();
    }
}
