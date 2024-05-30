public class Maximum_sum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {-1, 5, -6}, {7, 9, -10}};
        int current = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                current += arr[i][j];

                if (current > max) {
                    max = current;
                }

                if (current < 0) {
                    current = 0;
                }
            }
        }

        System.out.println(max);
    }
}
