package month02.week02.day01;

/*给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，
同时仍保留空格和单词的初始顺序。
*/
public class Day01_557 {
    public String reverseWords(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        int startIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                int tmp = i - 1;
                while (tmp >= startIndex) {
                    stringBuffer.append(s.charAt(tmp));
                    tmp--;
                }
                stringBuffer.append(' ');
                startIndex=i+1;
            }
            if(i==s.length()-1){
                int tmp = i;
                while (tmp >= startIndex) {
                    stringBuffer.append(s.charAt(tmp));
                    tmp--;
                }
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        String s1 = new Day01_557().reverseWords(s);
        System.out.println(s1);
        System.out.println(s.trim());
    }
}
