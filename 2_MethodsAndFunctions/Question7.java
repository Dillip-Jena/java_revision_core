//Statement
//Create overloaded methods add() for:
// 2 integers
// 3 integers
// 2 doubles

import java.util.Scanner;

public class Question7 {
    public static int add(int n1, int n2){
        return n1 + n2;
    }

    public static int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public static double add(double n1, double n2){
        return n1 + n2;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Adding two integers: " + add(5, 10));
        System.out.println("Adding three integers: " + add(5, 10, 15));
        System.out.println("Adding two doubles: " + add(2.5, 6.4));

        scr.close();
    }
}
