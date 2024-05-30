public class Copy_array {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr1 = {{7, 8, 9}, {10, 11, 12}};
        int row = Math.max(arr.length, arr1.length);
        int column = arr[0].length + arr1[0].length;
        int[][] newArr = new int[row][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[i][j] = arr[i][j];
            }
            for (int j = 0; j < arr1[0].length; j++) {
                newArr[i][j + arr[0].length] = arr1[i][j];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
