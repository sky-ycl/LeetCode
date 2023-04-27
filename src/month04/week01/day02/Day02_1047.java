package month04.week01.day02;

import java.util.Stack;

public class Day02_1047 {
    public String removeDuplicates(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stringBuilder.length()==0){
                stringBuilder.append(c);
            }else{
                int length = stringBuilder.length();
                if(stringBuilder.charAt(length-1)==c){
                    stringBuilder.deleteCharAt(length-1);
                }else{
                    stringBuilder.append(c);
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = new Day02_1047().removeDuplicates("abbaca");
        System.out.println(s);
    }
}
