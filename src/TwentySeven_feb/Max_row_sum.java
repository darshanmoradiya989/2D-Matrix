package TwentySeven_feb;

public class Max_row_sum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {8, 9, 10}, {11, 5, 7}};
        int currectSum;
        int max = Integer.MIN_VALUE;
        int row = 0;

        for (int i = 0; i < arr.length; i++){
            currectSum = 0;
            for (int j = 0; j < arr[0].length; j++){
                currectSum += arr[i][j];
                if (currectSum > max){
                    max = currectSum;
                    row = i;
                }
            }
        }
        System.out.println("max row sum : " + max);
        System.out.println("row number : " + row);
    }
}
