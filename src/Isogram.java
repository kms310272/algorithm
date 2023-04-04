package src;
//import java.util.regex.*;

import java.util.HashMap;

public class Isogram {
    public static void main(String[] args) {
        Isogram iso = new Isogram();

        boolean output = iso.isIsogram("dropOut");
        System.out.println(output); // false

        output = iso.isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = iso.isIsogram("moOse");
        System.out.println(output); // false
    }
    public boolean isIsogram(String str) {
        if(str == "") return true;
        String lowStr = str.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i <lowStr.length(); i++) {
            map.put(lowStr.charAt(i), i);
        }
        if(map.size() == lowStr.length()) {
            return  true;
        }
        return false;
//        Pattern pattern = Pattern.compile("[a-zA-Z]");
//        Matcher matcher = pattern.matcher(str);
//        return matcher.find();
    }
}
