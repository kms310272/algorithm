package src;

public class GetEvenNumbers {

    public static void main(String[] args){
        int[] arr01 = {3, 2, 10, 5, 8};
        int[] arr02 = {27, 8, 23, 24, 98, 7};
        int[] arr03 = {27, 1, 11, 23, 7};
        int[] arr04 = {};


        int[] rst01 = getEvenNumbers(arr01);
        int[] rst02 = getEvenNumbers(arr02);
        int[] rst03 = getEvenNumbers(arr03);
        int[] rst04 = getEvenNumbers(arr04);
        int a = 1;
    }
    public static int[] getEvenNumbers(int[] arr) {
        int evenCount=0;

        for(int i = 0; i < arr.length; i++) { // i=1; i<5; i++
            if( arr[i] % 2 == 0 ) {			  // 3 % 2 == 1
                evenCount++;
            }
        }

        if(evenCount == 0){
            int[] blankArr = {};
            return blankArr;
        }

        int[] evenNum = new int[evenCount];
        int j=0;

        for(int i = 0; i < arr.length; i++) { // i=1; i<5; i++
            if( arr[i] % 2 == 0 ) {			  // 3 % 2 == 1
                evenNum[j++] = arr[i];
            }
        }

        return evenNum;
    }
}
