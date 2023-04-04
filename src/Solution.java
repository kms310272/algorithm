package src;

public class Solution {
    public static void main(String[] args) {
        int[] output = getElementsUpTo(new int[]{4, 5, 6, 7, 17, 10}, 3);
    }
    public static int[] getElementsUpTo(int[] arr, int n) {
        //1. 새로운 배열 지정
        int[] newArr = new int[arr.length];
        //2. 배열의 길이 이상의 인덱스를 받으면, 빈배열 리턴
        if(n >= arr.length){
            int[] emptyArr = new int[]{};
            return emptyArr;
        }
        //3. 인덱스 이후의 값들을 새로운 배열에 복사
        System.arraycopy(arr, 0, newArr , n, arr.length);
        return newArr;
    }
}
