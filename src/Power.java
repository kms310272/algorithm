package src;

public class Power {
    public static void main(String[] args) {
        Power pow = new Power();

        long output = pow.power(3, 40);
        System.out.println(output); // --> 19334827
    }
    public long power(int base, int exponent) {
        //exponent변수가 0이 될때까지 재귀를 돌린후, 나머지 연산을 계산하기,
        if(exponent == 0) return 1;

        int half = exponent / 2;
        long temp = power(base, half);
        long result = (temp * temp) % 94906249;

        //홀수일 경우 다시 연산하여 리턴.
        if(exponent % 2 == 1) return (base * result) % 94906249;
        else return result;
    }
}
