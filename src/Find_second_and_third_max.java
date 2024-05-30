public class Find_second_and_third_max {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3},{5,6,7},{8,9,10}};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j] > max){
                    max3 = max2;
                    max2 = max;
                    max = arr[i][j];
                } else if (arr[i][j] > max2 && arr[i][j] != max){
                    max2 = arr[i][j];
                }else if (arr[i][j] > max3 && arr[i][j] != max2){
                    max3 = arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(max2);
        System.out.println(max3);
    }
}
