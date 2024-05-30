package Twenty_nine_feb_searching_binary;

public class search_log_row_plus_log_col {
    // in this matrix all row and column sorted by every side
    // search present or not
    // time complexity : (log row + log col)
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 11;
        int row = mat.length;
        int col = mat[0].length;
        int top = 0, bottom = row - 1;
        int rowToBeSearch = -1;

        while (top <= bottom){
            int midRow = (top + bottom) / 2;
            if (target >= mat[midRow][0] && target <= mat[midRow][col - 1]){
                rowToBeSearch = midRow;
                break;
            } else if (target > mat[midRow][col-1]) {
                top = midRow + 1;
            } else {
                bottom = midRow - 1;
            }
        }
        if (rowToBeSearch == -1){
            System.out.println("not present");
            return;
        }

        int left = 0, right = col - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (mat[rowToBeSearch][mid] == target){
                System.out.println("present");
                return;
            } else if (target > mat[rowToBeSearch][mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("not present");

    }
}
