package TwentySeven_feb;

public class Max_column_sum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {8, 22, 10}, {11, 5, 7}};
        int currentSum;
        int max = Integer.MIN_VALUE;
        int col = 0;

        for (int i = 0; i < arr[0].length; i++) {
            currentSum = 0;
            for (int j = 0; j < arr.length; j++) {
                currentSum += arr[j][i];
                if (currentSum > max) {
                    max = currentSum;
                    col = i;
                }
            }
        }
        System.out.println("max column sum : " + max);
        System.out.println("column no : " + col);
    }
}
