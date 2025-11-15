//Create methods for:
//Addition, Subtraction, Multiplication and Division
//And call them based on user's choice using a menu

import java.util.Scanner;

public class Question6 {
    public static int addition(int n1, int n2){
        return n1 + n2;
    }

    public static int subtraction(int n1, int n2){
        return n1 - n2;
    }

    public static int multiplication(int n1, int n2){
        return n1 * n2;
    }

    public static int division(int n1, int n2){
        if(n2 == 0){
            System.out.print("Error: Cannot divide by zero! ");
            return 0;
        }
        return n1 / n2;
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int choice = 0;
        while(choice!=5){
            System.out.println("\n====================Menu==================");

            System.out.println("\n\t1)Addition\n\t2)Subtraction\n\t3)Multiplication\n\t4)Division\n\t5)Exit");
            System.out.print("\nEnter your choice: ");
            choice = scr.nextInt();

            if(choice == 5) {
                System.out.println("Exiting ...");
                break;
            }

            System.out.print("Input first number: ");
            int num1 = scr.nextInt();
            System.out.print("Input second number: ");
            int num2 = scr.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result = " + addition(num1, num2));
                    break;

                case 2:
                    System.out.println("Result = " + subtraction(num1, num2));;
                    break;

                case 3:
                    System.out.println("Result = " + multiplication(num1, num2));;
                    break;

                case 4:
                    System.out.println("Result = " + division(num1, num2));;
                    break;
            
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        scr.close();
    }
}
