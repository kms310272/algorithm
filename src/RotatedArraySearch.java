package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatedArraySearch {
    public static void main(String[] args) {
        RotatedArraySearch rote = new RotatedArraySearch();

        int output = rote.rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 2);
        System.out.println(output); // --> 5

        output = rote.rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 100);
        System.out.println(output); // --> -1
    }
    public int rotatedArraySearch(int[] rotated, int target) {

        List<Integer> rotate = new ArrayList(Arrays.asList(rotated));

        if(rotate.contains(target)) {
            String values = "";
            int index = values.indexOf(target);
            return index;
        }else{
            return -1;
        }
    }
}
