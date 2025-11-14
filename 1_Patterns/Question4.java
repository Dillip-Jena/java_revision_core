//Statement
//Print the pyramid of numbers instead of *
//Example n=5

//Pattern
//     1        
//    1 2       
//   1 2 3      
//  1 2 3 4     
// 1 2 3 4 5    

public class Question4 {
    public static void main(String[] args){
        int size = 5;
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
