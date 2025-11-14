//Statement
//Print a square of numbers increasing row-wise
//Example n=4

//Pattern
// 1 2 3 4
// 2 3 4 5
// 3 4 5 6 
// 4 5 6 7

public class Question9 {
    public static void main(String[] args){
        int size = 4;
        for(int i=1; i<=size; i++){
            for(int j=i; j<size+i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
