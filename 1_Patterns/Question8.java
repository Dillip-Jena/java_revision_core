//Statement
//Print Pascel's triangle using loops
//Example n=5

//Pattern
//     1        4   0
//    1 1       3   1
//   1 2 1      2   2
//  1 3 3 1     1   3
// 1 4 6 4 1    0   4

// logic
    //            [0][0]			
	//         [1][0] [1][1]
    //      [2][0] [2][1] [2][2]		j=1 i=2


	// triangle[i-1][j-1] + triangle[i-1][j]

public class Question8 {
    public static void main(String[] args){
        int row = 5;

        int[][] triangle = new int[row][row];
        for(int i=0; i<row; i++){
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for(int j=1; j<i; j++){
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        //print the triangle
        for(int i=0; i<row; i++){
            for(int j=row-1-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(triangle[i][k] + " ");
            }
            System.out.println();
        }        
    }
}
