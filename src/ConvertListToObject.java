package src;

import java.util.HashMap;

public class ConvertListToObject {

    public static void main(String[] args ) {

        ConvertListToObject test = new ConvertListToObject();

        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };
        test.convertListToHashMap(arr);
    }
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        HashMap<String, String> map = new HashMap<String, String>();

        if(arr.length == 0) return map;
        System.out.println(arr[0].length);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length != 0 ){
                map.put(arr[i][0], arr[i][1]);
            }
        }
        return map;
    }
}
