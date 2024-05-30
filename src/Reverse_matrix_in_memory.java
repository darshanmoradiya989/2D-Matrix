import java.util.Arrays;

public class Reverse_matrix_in_memory {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[0].length - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
