package month08.week04.day03;

public class Day03_competition_357_1 {
    public String finalString(String s) {
        StringBuilder builder = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'i') {
                builder.reverse();
                continue;
            }
            builder.append(c);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String s = new Day03_competition_357_1().finalString("poiinter");
        System.out.println(s);
    }
}
