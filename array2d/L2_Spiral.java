package array2d;

public class L2_Spiral {
    public static void spiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length - 1;
        while(startRow <= endRow && startCol <= endCol){
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            for(int j=startRow+1; j<=endRow; j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int j=endRow-1; j>=startRow+1; j--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[j][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println("");
        
    }
    
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        spiral(matrix);
    }
}
