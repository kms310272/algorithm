package src;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        int output = fibonacci.fibonacci(0);
        System.out.println(output); // --> 0

        output = fibonacci.fibonacci(1);
        System.out.println(output); // --> 1

        output = fibonacci.fibonacci(5);
        System.out.println(output); // --> 5

        output = fibonacci.fibonacci(9);
        System.out.println(output); // --> 34
    }
    public int fibonacci(int num) {
        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(0);
        memo.add(1);
        System.out.println(memo);
        return aux(memo, num);
    }
    public int aux(ArrayList<Integer> memo, int num) {
        if (memo.size() <= num) {
            memo.add(aux(memo, num - 1) + aux(memo, num - 2));
        }
        System.out.println("2" + memo);
        return memo.get(num);
    }
}
