public class Print_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3}};

        // row
        for (int i = 0; i < arr.length; i++){
            //column
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
