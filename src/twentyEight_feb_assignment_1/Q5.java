package twentyEight_feb_assignment_1;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        int row = mat.length;
        int col = mat[0].length;
        int[][] newArr = new int[col][row];

        for (int i = 0; i < col; i++) {
            int l = 0;
            for (int j = row - 1; j >= 0; j--) {
                System.out.print(mat[j][i] + " ");
                newArr[i][l] = mat[j][i];
                l++;
            }
            System.out.println();
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(Arrays.toString(newArr[i]));
        }

    }
}
