//Statement
//Print an inverted number pyramid.
//Example n=5

//Pattern
//1 2 3 4 5 0
// 1 2 3 4  1
//  1 2 3   2   
//   1 2    3
//    1     4

public class Question5 {
    public static void main(String[] args){
        int size = 5;
        for(int i=1; i<=size; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=size+1-i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
