package month04.week03.day05;

public class Day05_1876 {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int i = 0;
        int count = 0;
        while (i + 2 < n) {
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i + 1) != s.charAt(i + 2)&&s.charAt(i)!=s.charAt(i+2)) {
                count++;
            }
            i++;
        }
        return count;
    }
}
