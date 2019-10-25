public class floodFill {

    public static void FloodFill(char [][] matrix, int x, int y, char val, char nval){
        if (x<0 || x>= matrix[0].length || y< 0 || y>= matrix.length){
            return ;
        }
        if (matrix [x][y]!=val)
            return;
        matrix [x][y] = nval;
        FloodFill(matrix, x, y+1,val, nval);
        FloodFill(matrix, x,y-1, val,nval);
        FloodFill(matrix, x+1, y, val,nval);
        FloodFill(matrix, x-1, y, val, nval);

    }

    public static void replaceZeros(char [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i=0;i<cols;i++){
            for (int  j =0;j<rows;j++){
                if(matrix[i][j]=='O')
                    matrix[i][j]='-';
            }
        }
        for (int i=0; i<rows;i++){
            if (matrix[i][0]=='-')
                FloodFill(matrix,i,0,'-','O');
        }
        for (int i=0; i<rows;i++){
            if (matrix[i][rows-1]=='-')
                FloodFill(matrix,i,rows-1,'-','O');
        }
        for (int i=0; i<cols;i++){
            if (matrix[0][i]=='-')
                FloodFill(matrix,0,i,'-','O');
        }
        for (int i=0; i<cols;i++){
            if (matrix[cols-1][i]=='-')
                FloodFill(matrix,cols-1,i,'-','O');
        }

        for (int i=0;i<cols;i++){
            for (int  j =0;j<rows;j++){
                if(matrix[i][j]=='-')
                    matrix[i][j]='X';
            }
        }

    }



    public static void main (String [] aargs ) {
        char[][] mat = {{'X', 'O', 'X', 'O', 'X', 'X'},
                {'X', 'O', 'X', 'X', 'O', 'X'},
                {'X', 'X', 'X', 'O', 'X', 'X'},
                {'O', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'O', 'X', 'O'},
                {'O', 'O', 'X', 'O', 'O', 'O'}};
        replaceZeros(mat);


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println("");
        }
    }
}
