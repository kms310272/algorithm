package src;

public class LetterCapital {

    public static void main(String[] args){

        LetterCapital lc = new LetterCapital();

//        String output1 = lc.letterCapitalize("hello world");
//        System.out.println(output1); // "Hello World"
//        String output2 = lc.letterCapitalize("java  is good");
//        System.out.println(output2); // "Java  Is Good"

        String output3 = lc.letterCapitalize("what a wonderful life");
        System.out.println(output3); // "Java  Is Good"
        String output4 = lc.letterCapitalize("nEVER  gIVE uP");
        System.out.println(output4); // "Java  Is Good"
        String output5 = lc.letterCapitalize("you can DO it!");
        System.out.println(output5); // "Java  Is Good"

        String output6 = lc.letterCapitalize("    ");
        System.out.println(output6); // "Java  Is Good"

        String output7 = lc.letterCapitalize("");
        System.out.println(output7); // "Java  Is Good"
    }

    public String letterCapitalize(String str) {
        //1. 빈 문자(공백)으로만 이루어진 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다. ->처리
        if("".equals(str)) return "";
        boolean isBlank = true;
        String returnStr = "";

        //1. for문으로 처음부터 끝까지 문자를 하나씩 확인하기
        for(int i=0; i<str.length(); i++){
            Character c = str.charAt(i); //1.1. 문자 하나 꺼내오기
            if(Character.isAlphabetic(c)){ //1.2. 알파벳인 경우
                isBlank = false;

                if( i == 0 ){ //1.2.1. 바로 앞 문자가 공백이 있는지 알파벳인지 확인
                    returnStr += Character.toUpperCase(c);
                    continue;
                }
                Character prevCharacter = returnStr.charAt(i-1);
                returnStr += Character.isAlphabetic(prevCharacter) ? c : Character.toUpperCase(c);

            }else{ //1.2. 알파벳이 아닌경우 -> returnStr에 더하기
                returnStr += c;
            }
        }

        return isBlank ? "":returnStr;

    }
}
