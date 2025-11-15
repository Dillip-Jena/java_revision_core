//Statement
//Create a method int countVowels(String str) that returns how many vowels (a, e, i, o, u) are in the string.

import java.util.Scanner;

public class Question10 {
    public static int countVowels(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            ch = Character.toLowerCase(ch);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Input a string: ");
        String str = scr.next();

        System.out.println("Vowels: " + countVowels(str));

        scr.close();
    }
}
