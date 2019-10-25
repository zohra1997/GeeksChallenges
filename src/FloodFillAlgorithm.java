public class FloodFillAlgorithm {
    public static void algorithm (int [][] image, int x, int y, int target, int value){

        if (x<0 || x>=4|| y<0 || y>=4)
            return ;
        if (image [x][y]!=target )
            return ;
        image[x][y] = value;
        algorithm(image, x, y + 1, target, value);
        algorithm(image, x, y - 1, target, value);
        algorithm(image, x + 1, y, target, value);
        algorithm(image, x - 1, y, target, value);

    }

    public static void main(String[] args) {
        int [][] image = {{0,1,1,0},{1,1,1,1},{0,1,2,3},{1,2,3,4}};
        algorithm(image,1,2,1,5);
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++)
                System.out.print(image[i][j]);
            System.out.println();
        }
    }
}
