//Statement
//Diamond of stars combining a pyramid and inverted pyramid
//Example n = 3

//Pattern
//   *      2   1   0
//  ***     1   3   1
// *****    0   5   2
//  ***     1   3   0
//   *      2   1   1

public class Question7 {
    public static void main(String[] args){
        int size = 3;
        for(int i=0; i<size; i++){
            for(int j=size-1-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<size-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=size-2*i; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
