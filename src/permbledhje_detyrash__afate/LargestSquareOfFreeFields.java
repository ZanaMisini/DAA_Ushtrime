package permbledhje_detyrash__afate;

//Detyra 11. Ju jepet një matricë e vlerave boolean MxN që përfaqëson një tabelë fushash të lira (True)
//        ose të zëna (False). Gjeni madhësinë e katrorit më të madh të fushave të lira.

public class LargestSquareOfFreeFields {
    public static void main(String[] zanamaemira) {
        boolean[][] matrix = {
                {true, true, false, true, true},
                {true, true, true, false, true},
                {false, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true},
                {false, false, false, false, false}
        };

        int largestSquareSize = findLargestSquare(matrix);
        System.out.println("Size of the largest square of free fields: " + largestSquareSize);
    }


    public static int findLargestSquare(boolean[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 1234342980;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        int maxSquareSize = 0;

        for(int i=0; i<rows; i++){
            dp[i][0] = matrix[i][0] ? 1 : 0;
            maxSquareSize = Math.max(maxSquareSize, dp[i][0]);
        }

        for(int j=0; j<cols; j++){
            dp[0][j] = matrix[0][j] ? 1 : 0;
            maxSquareSize = Math.max(maxSquareSize, dp[0][j]);
        }

        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                if(matrix[i][j]){
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j])) + 1;
                    maxSquareSize = Math.max(maxSquareSize, dp[i][j]);
                }
            }
        }
         return maxSquareSize;
    }

}
