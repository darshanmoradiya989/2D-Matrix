public class Max_row_sum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int max = 0;
        int row = -1;

        for (int i = 0; i < arr.length; i++) {
            int current = 0;
            for (int j = 0; j < arr[i].length; j++) {
                current += arr[i][j];
                if (current > max) {
                    max = current;
                    row = i;
                }
            }
        }

        // print if array is not empty
        if (row != -1) {
            System.out.println("row number : " + row);
        } else {
            System.out.println("array is empty");
        }

        //print max sum of row
        System.out.println("Maximum sum of a row: " + max);
    }
}

