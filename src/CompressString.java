package src;

import java.util.Objects;

public class CompressString {
    public static void main(String[] agrs) {
        CompressString cp = new CompressString();

        String output = cp.compressString("abc");
        System.out.println(output); // --> "abc"

        output = cp.compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }
    public String compressString(String str) {
        if(Objects.equals(str, "")) return "";

        int count = 1;
        String result = "";

        for(int i = 0; i < str.length(); i ++) {

            //같을때
            if( i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;

            //같지 않을때
            }else{

                //* 앞에껄 결과에 넣어야 한다.
                if (count >= 3) {
                    result += ""+ count + str.charAt(i);
                }else{
                    //i번째 문자를 결과에 넣는다?
                    for(int j = 0; j < count; j++) {
                        result += str.charAt(i);
                    }
                }
                //다 하고 난 후 count 초기화.
                count = 1;
            }
        }
        return result;
    }
}
