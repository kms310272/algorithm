package src;

public class Modulo {
    public static void main(String[] args){

//        Integer output = new Modulo().modulo(4, 4);
//        System.out.println(output); // --> 1
        Integer output = new Modulo().modulo(123, 4);
        System.out.println(output); // --> 1
        output = new Modulo().modulo(0, 4);
        System.out.println(output); // --> 1
        output = new Modulo().modulo(4, 0);
        System.out.println(output); // --> 1
        output = new Modulo().modulo(123456789, 67);
        System.out.println(output); // --> 1

//        output = new Modulo().modulo(25, 0);
//        System.out.println(output); // --> null
    }

    public Integer modulo(int num1, int num2) {

        int i=1;
        int temp = 1;

        if(num1 == 0) return 0;
        if(num2 == 0) return null;

        //1. num2를 1부터 곱한다 (num1보다 작을때까지 && num2 * i가 num2보다 작을떄까지)
        while(num1 >= temp){
            temp = num2 * i;
            int minus = num1 - temp;
            if(minus <= num2){
                return minus;
            }
            i++;
        }

        return 0;

    }
}
