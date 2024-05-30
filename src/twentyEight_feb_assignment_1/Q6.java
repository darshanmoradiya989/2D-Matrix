package twentyEight_feb_assignment_1;

public class Q6 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 0, 0},
                {0, 1, 1},
                {1, 1, 1}
        };

        int rowNumber = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int current = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    current++;
                }
                if (current > max) {
                    max = current;
                    rowNumber = i;
                }
            }
        }

        System.out.println(rowNumber);


    }
}
