//Statement
//Print a triangle starting with n stars and decreasing each row
//Example n=5

//Pattern
// ***** 
// **** 
// *** 
// ** 
// *

public class Question3 {
    public static void main(String[] args){
        int size = 5;
        for(int i=0; i<size; i++){
            for(int j=0; j<size-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
