package src;

public class ReadVertically {
    public String readVertically(String[] arr) {
        int max = 0;
        String result = "";
        for(int i = 0; i < arr.length; i ++) {
            if(max < arr[i].length()) {
                max = arr[i].length();
            }
        }
        String[] newArr = new String[max];

        for(int i = 0; i <arr.length; i++) {
            String str = arr[i];
            for(int k = 0; k < str.length(); k++) {
                if(newArr[k] == null){
                    newArr[k] = Character.toString(str.charAt(k));
                }else {
                    newArr[k] = newArr[k] + str.charAt(k);
                }
            }
        }
        for(int j =0; j < newArr.length; j ++){
            result += newArr[j];
        }
        return  result;
    }
}
