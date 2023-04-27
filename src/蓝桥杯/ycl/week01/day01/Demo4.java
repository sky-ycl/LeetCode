package 蓝桥杯.ycl.week01.day01;

import java.util.Locale;

public class Demo4 {
    public static void main(String[] args) {
        for(int i=8327;i<=8328;i++) {
            String s = Integer.toHexString(i).toUpperCase();
            if(isCharacter(s)) {
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean isCharacter(String s) {
        while(true) {
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i)!='A' || s.charAt(i)!='B' || s.charAt(i)!='C' || s.charAt(i)!='D' || s.charAt(i)!='E' || s.charAt(i)!='F') {
                    return false;
                }
            }
            return true;
        }
    }
}
