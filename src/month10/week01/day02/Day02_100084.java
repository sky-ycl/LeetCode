package month10.week01.day02;


public class Day02_100084 {

    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String res = s;
        for (int i = 0; i < n; i++) {
            int count = 0;
            String s1 = "";
            for (int j = i; j < n && count < k + 1; j++) {
                char c = s.charAt(j);
                s1 += c;
                if (c == '1') count++;
                if (count == k) res = isLegal(res, s1);
            }
            if (count < k) return "";
        }
        return res;
    }

    public String isLegal(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n != m) return n > m ? s2 : s1;
        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                return c1 > c2 ? s2 : s1;
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        String res = new Day02_100084().shortestBeautifulSubstring("1100100101011001001", 10);
        System.out.println(res);
        String legal = new Day02_100084().isLegal("11101011011011", "10101101101111");
        System.out.println(legal);
        System.out.println("100101011001001".length());
        System.out.println("1100100101011".length());
    }
}
