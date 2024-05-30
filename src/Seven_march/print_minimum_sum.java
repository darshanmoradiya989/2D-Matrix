package Seven_march;

public class print_minimum_sum {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 1, 4, 0},
                {3, 1, 5, 4},
                {2, 1, 0, 3}
        };
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (i == 0 && j == 0){
                    continue;
                } else if (i == 0) {
                    arr[i][j] = arr[i][j] + arr[i][j - 1];
                } else if (j == 0) {
                    arr[i][j] = arr[i][j] + arr[i - 1][j];
                } else {
                    arr[i][j] = arr[i][j] + Math.min(arr[i][j - 1], arr[i - 1][j]);
                }
            }
        }
        System.out.println(arr[row - 1][col - 1]);

    }
}
