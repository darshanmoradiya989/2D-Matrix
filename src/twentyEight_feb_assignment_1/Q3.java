package twentyEight_feb_assignment_1;

public class Q3 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};


        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            mat[i][i] = 0;
            sum += mat[i][mat.length - i - 1];
        }

        System.out.println(sum);
    }
}
