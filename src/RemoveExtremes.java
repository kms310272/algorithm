package src;

public class RemoveExtremes {
    public static void main(String[] args) {
        RemoveExtremes remove = new RemoveExtremes();
        remove.removeExtremes(new String[]{"a", "b", "c", "def"});
    }
    public String[] removeExtremes(String[] arr) {
        if( arr.length == 0 ) return null;

        int max = 20;
        int min = 0;
        int maxIdx = 0;
        int minIdx = 0;

        for(int i = 0; i < arr.length; i++) {
            if(min <= arr[i].length()) {
                min = arr[i].length();
                minIdx = i;
            }
            if(max >= arr[i].length()) {
                max = arr[i].length();
                maxIdx = i;
            }
        }
        String[] result = new String[arr.length -2];
        int currentIdx = 0;
        for(int i = 0; i < arr.length; i++){
            if(i != minIdx && i != maxIdx){
                result[currentIdx] = arr[i];
                currentIdx++;
                System.out.println("min" + minIdx);
                System.out.println("max" + maxIdx);
            }
        }
        return result;
    }

}
