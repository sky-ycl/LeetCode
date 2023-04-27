package month02.week03.day04;

/*平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
给你一个平衡字符串 s，请你将它分割成尽可能多的子字符串，并满足：
每个子字符串都是平衡字符串。
返回可以通过分割得到的平衡字符串的 最大数量 。
*/
public class Day04_1221 {
    public int balancedStringSplit(String s) {
        int RCount = 0;
        int LCount = 0;
        int strCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (RCount == LCount && RCount != 0 && LCount != 0) {
                strCount++;
                RCount = 0;
                LCount = 0;
            }
            if (s.charAt(i) == 'R') {
                RCount++;
            }
            if (s.charAt(i) == 'L') {
                LCount++;
            }
        }
        return strCount + 1;
    }

    public static void main(String[] args) {
        int res = new Day04_1221().balancedStringSplit("RLRRLLRLRL");
        System.out.println(res);
    }
}
