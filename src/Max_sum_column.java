public class Max_sum_column {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 12, 9}, {1, 2, 3}};

        
        int max = 0;
        int column = -1;

        for (int i = 0; i < arr[0].length; i++) {
            int current = 0;
            for (int j = 0; j < arr.length; j++) {
                current += arr[j][i];
                if (current > max) {
                    max = current;
                    column = i;
                }
            }
        }

        // print if array is not empty
        if (column != -1) {
            System.out.println("column number : " + column);
        } else {
            System.out.println("array is empty");
        }

        // print max sum of column
        System.out.println("Maximum sum of a column: " + max);
    }
}
