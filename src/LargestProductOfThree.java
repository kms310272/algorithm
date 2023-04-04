package src;

import java.util.Arrays;

public class LargestProductOfThree {
    public static void main(String[] args) {
        LargestProductOfThree lpt = new LargestProductOfThree();

        int output = lpt.largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = lpt.largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)

    }
    public int largestProductOfThree(int[] arr) {
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        int arrLength = arr.length;
        //가장 큰 양수 3가지를 곱한 값
        int candidate1 = arr[arrLength - 1] * arr[arrLength - 2] * arr[arrLength - 3];
        //가장 작은 음수 2가지와, 가장 큰 양수를 곱한 값
        int candidate2 = arr[arrLength - 1] * arr[0] * arr[1];
        return Math.max(candidate1, candidate2);
    }
}
