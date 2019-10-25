public class Image {
    static void transpose(int arr[][], int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }

    }

    public static void swap(int[]row) {
        int j = row.length;
        for (int i = 0; i < j / 2; i++) {
            int tmp = row[i];
            row[i] = row[j - 1 - i];
            row[j - 1 - i] = tmp;
        }

    }

    public static void main(String[] args) {
        int[][] image = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = image.length;
        int cols = image[0].length;

        transpose(image, rows, cols);
        for (int i = 0; i < image.length; i++) {
            swap(image[i]);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();

        }
    }
}
