public class Count_of_row_column {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 2, 3},{1, 2, 3},{1, 2, 3}};
        int row = 0;
        int column = 0;


        for (int i = 0; i < arr.length; i++) {
            row++;
            for (int j = 0; j < arr[0].length; j++) {
               column++;
            }
        }

        int totalCol = column / row;

        System.out.println("total rows " + row);
        System.out.println("total columns " + totalCol);
    }
}
