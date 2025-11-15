//Statement
//Write a method boolean isPrime(int n) that returns true if n is prime.
//Use this method in main() to print primes between 1 and 100.

public class Question1{
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("All the prime numbers between 1 and 100: ");
        for(int i=1; i<=100; i++){
            if(isPrime(i)) System.out.print(i + " ");
        }
    }
}