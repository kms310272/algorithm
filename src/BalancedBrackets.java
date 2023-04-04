package src;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {

        BalancedBrackets balancedBrackets = new BalancedBrackets();
        boolean output = balancedBrackets.balancedBrackets("[]}{()");
        System.out.println(output); // --> false

        boolean output2 = balancedBrackets.balancedBrackets("[({})]");
        System.out.println(output2); // --> true

        boolean output3 = balancedBrackets.balancedBrackets("[(]{)}");
        System.out.println(output3); // --> false
    }

    public boolean balancedBrackets(String str) {
        Stack<Character> st = new Stack<>();
        if (str.length() == 0) return false;

        for (int i = 0; i < str.length(); i++) {
            char bracket = str.charAt(i);
            if ('(' == bracket || '{' == bracket || '[' == bracket) {
                st.push(bracket);
            } else {
                char popBracket = 'a';
                if (bracket == ')') {
                    while (st.size() > 0) {
                        popBracket = st.pop();
                        if (popBracket == '(') break;
                    }

                } else if (bracket == '}') {
                    while (st.size() > 0) {
                        popBracket = st.pop();
                        if (popBracket == '{') break;
                    }

                } else if (bracket == ']') {
                    while (st.size() > 0) {
                        popBracket = st.pop();
                        if (popBracket == '[') break;
                    }
                }

                if (st.size() == 0 && !(popBracket == '[' || popBracket == '(' || popBracket == '{')) {
                    return false;
                }
            }
        }
        if(st.size() > 0){
            return false;
        }

        return true;
    }
}

//            if(change == ')' && st.size() == 0) {
//                return false;
//            }else if(change == ')' && st.size() > 0) {
//                st.pop();
//            } else if(change == '(') {
//                st.push(change);
//            }
//        return st.empty();