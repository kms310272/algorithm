package src;

public class NumberSearch {
    public static void main(String[] args) {
        NumberSearch ns = new NumberSearch();

//        int output = ns.numberSearch("Hello6 ");
//        System.out.println(output); // --> 1
//
//        output = ns.numberSearch("Hello6 9World 2,");
//        System.out.println(output); // --> 2

        int output = ns.numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
    public int numberSearch(String str) {
        if(str == "") return 0;

        float sum = 0;
        String match = "[^a-zA-Z]";
        String inStr = str.replaceAll(match,"");
        System.out.println(inStr.length());
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(48 <= ch && ch <= 57){
                sum += (int)ch - '0';
            }
        }
        return Math.round(sum / inStr.length());
    }
}
