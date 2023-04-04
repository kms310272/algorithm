package src;

public class AbCheck {
    public static void main(String[] args) {
        AbCheck ab = new AbCheck();
        System.out.println(ab.ABCheck("HK9J6YjrAcMbq8qKrbS3EaPRT"));
    }
    public boolean ABCheck(String str) {
        str = str.toLowerCase();
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] == 'a' || arr[i] == 'b') {
                if(arr[i] == 'a' || arr[i] == 'b') {
                    return true;
                }
                else return false;
            }
        }
        return false;
    }
}
