package month04.week03.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day01_151 {
    public String reverseWords(String s) {
       //去除前后空格
        String[] s1 = s.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--) {
            if(s1[i]==""){
                continue;
            }
            if(i==0){
                stringBuilder.append(s1[i]);
                break;
            }
            stringBuilder.append(s1[i]+" ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = new Day01_151().reverseWords( "  hello world  ");
        System.out.println(s);
    }
}
