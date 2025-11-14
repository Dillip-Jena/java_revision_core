//Statement
//Print a right-angled triangle aligned to the right
//Example n=5

//Pattern
//     * 
//    ** 
//   *** 
//  **** 
// ***** 

public class Question2 {
    public static void main(String[] args){
        int size = 5;
        for(int i=0; i<size; i++){
            for(int j=0; j<size-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
