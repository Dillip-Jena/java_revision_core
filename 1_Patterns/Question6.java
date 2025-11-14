//Statement
//Hollow pyramid of * symbols
//Example n=5

//Pattern
//     *            
//    * *           
//   *   *          
//  *     *         
// *********        

public class Question6 {
    public static void main(String[] args){
        int size = 5;
        for(int i=1; i<size; i++){
            for(int j=1; j<=size-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i-1); k++){
                if(k==1 || k==(2*i-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int l=1; l<=size*2-1; l++){
            System.out.print("*");
        }
        System.out.println();
    }
}
