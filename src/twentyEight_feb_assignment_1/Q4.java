package twentyEight_feb_assignment_1;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 9, 4},
                {0, 3, 8},
                {11, 5, 9}};
        int sum = 14;
        int row = mat.length;
        int col = mat[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < row; k++) {
                    for (int t = 0; t < col; t++) {
                            if (mat[i][j] + mat[k][t] == sum) {
                                System.out.println("present");
                                return;
                            }
                    }
                }
            }
        }



        System.out.println("not present");


    }
}
