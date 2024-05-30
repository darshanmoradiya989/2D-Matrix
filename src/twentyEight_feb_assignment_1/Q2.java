package twentyEight_feb_assignment_1;

public class Q2 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};


        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][mat.length - i - 1]);
        }

    }
}
