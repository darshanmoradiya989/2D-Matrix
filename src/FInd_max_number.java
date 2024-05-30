public class FInd_max_number {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3},{5,6,7},{8,9,10}};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
