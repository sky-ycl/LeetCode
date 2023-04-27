package month01.week03.day05;

/*如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。
则可以认为该短语是一个 回文串 。
字母和数字都属于字母数字字符。
给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
*/
public class Day05_125 {
    public boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (Character.isUpperCase(c)) {
                    stringBuffer.append(Character.toLowerCase(c));
                } else {
                    stringBuffer.append(c);
                }
            }
        }
        int len = stringBuffer.length();
        for (int left = 0, right = len - 1; left < right; left++, right--) {
            if (stringBuffer.charAt(left) != stringBuffer.charAt(right)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="race a car";
        boolean res = new Day05_125().isPalindrome(s);
        System.out.println(res);
    }
}
