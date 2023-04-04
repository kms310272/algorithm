package src;

public class DecryptCaesarCipher {
    public static void main(String[] args) {
        DecryptCaesarCipher dc = new DecryptCaesarCipher();

        String output = dc.decryptCaesarCipher("khoor", 3);
        System.out.println(output); // --> hello

        output = dc.decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world
    }
    public String decryptCaesarCipher(String str, int secret) {
        if("".equals(str)) return "";
//        String match = "[^a-zA-Z]";
//        int findIdx = 0;
//        char[] result = new char[str.length()];
//        for(int i =0; i <str.length(); i++) {
//            result[i] = str.charAt(i - secret);
//        }
//        return Arrays.toString(result);


        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String result = "";

        for(int i = 0; i <str.length(); i++) {
            if(str.charAt(i) == ' '){
                result += str.charAt(i);
            }else {
                int asis = alpha.indexOf(str.charAt(i));
                System.out.println("asis :" + asis);
                int tobe = (asis - secret + alpha.length()) % alpha.length();
                System.out.println("tobe :" + tobe);
                result += alpha.charAt(tobe);
            }
        }
        return result;
    }
}
