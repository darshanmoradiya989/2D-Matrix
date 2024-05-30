package Twenty_nine_feb_searching_binary;

public class Search_row_plus_column {
    //in matrix all row and column are sorted but not all row sorted line by line
    // time complexity :  (row + col)

    public static void main(String[] args) {
        int[][] mat = {
                {2, 9, 15, 16},
                {4, 11, 17, 28},
                {6, 13, 20, 30},
                {8, 14, 22, 35}
        };

        int target = 14;
        int row = mat.length;
        int col = mat[0].length;
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0){
            if (mat[i][j] == target){
                System.out.println("present");
                return;
            } else if (target > mat[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("not present");
    }
}
