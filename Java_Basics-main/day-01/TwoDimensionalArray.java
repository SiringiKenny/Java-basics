public class TwoDimensionalArray{
    static int size=4;
    static int [][] twoDimensionalArray = new int [size][size];
    static int initData = 10;
    public static void main(String args []) {
        populateMatrix();
        printMatrix() ;      
    }
        
        static void populateMatrix(){
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    twoDimensionalArray[i][j]=initData++;
                }
    
            }
            
        }

        static void printMatrix(){
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    System.out.print("\t"+twoDimensionalArray[i][j] + "\t ") ;
                }
                System.out.println();

            }
            
        }


    }
