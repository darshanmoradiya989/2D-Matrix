public class Binary_search_in_2D_array {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 2, 3}};
        int target = 2;


        int left = 0;
        int right = arr[0].length - 1;
        while (left < arr.length && right >= 0) {
            if (arr[left][right] == target) {
                System.out.println("present");
                return;
            } else if (arr[left][right] < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("not present");
    }
}
