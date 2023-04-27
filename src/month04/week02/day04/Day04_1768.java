package month04.week02.day04;

/*给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。
如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
返回 合并后的字符串
*/
public class Day04_1768 {
    public String mergeAlternately(String word1, String word2) {
        int n = Math.max(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i<word1.length()) {
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = new Day04_1768().mergeAlternately("abc","pqrd");
        System.out.println(s);
    }
}
