package month02.week01.day02;

import java.util.HashMap;
import java.util.Map;

public class Day02_2325 {
    public String decodeMessage(String key, String message) {
        int index = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ' && !map.containsKey(key.charAt(i))) {
                char c = (char) (index + 97);
                map.put(key.charAt(i), c);
                index++;
            }
        }
        for (int j = 0; j < message.length(); j++) {
            if (message.charAt(j) == ' ') {
                stringBuffer.append(' ');
            } else {
                stringBuffer.append(map.get(message.charAt(j)));
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        String s = new Day02_2325().decodeMessage(key, message);
        System.out.println(s);
    }
}

