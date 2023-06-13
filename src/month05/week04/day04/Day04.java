package month05.week04.day04;

import java.util.*;

public class Day04 {

    public static String removeDuplicateWords(String s) {
        List<String> list = new LinkedList<>();
        int n = s.length();
        for (int i = 0; i < n ; i++) {
            String s1 = s.charAt(i) + "";
            if (!list.contains(s1.toLowerCase()) && !list.contains(s1.toUpperCase())) {
                list.add(s1);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String s = createString(56);
        System.out.println(s.length());
        System.out.println("原字符串:"+s);
        String s1 = removeDuplicateWords(s);
        System.out.println("新字符串"+s1);
        Random random = new Random();
    }

    public static String createString(int length) {
        //随机生成字符串
        String s = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(s.charAt(random.nextInt(s.length())));
        }
        return builder.toString();
    }
}
