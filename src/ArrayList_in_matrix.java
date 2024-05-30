import java.util.ArrayList;
import java.util.List;

public class ArrayList_in_matrix {
    public static void main(String[] args) {
        List<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new  ArrayList<>());
        arr.get(0).add(1);
        arr.get(0).add(2);
        arr.get(0).add(3);
        arr.add(new  ArrayList<>());
        arr.get(1).add(1);
        arr.get(1).add(2);
        arr.get(1).add(3);

        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
