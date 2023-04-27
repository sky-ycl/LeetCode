package month01.week02.day03;

/*给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
*/
public class Day03_01 {
    public int lengthOfLastWord(String s) {
        //反向遍历
        int index = s.length() - 1;
        //找到最后一个单词的最后一个字符
        while (s.charAt(index) == ' ') {
            index--;
        }
        //记录最后一个单词的长度
        int wordLength = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            index--;
            wordLength++;
        }
        return wordLength;
    }

    public static void main(String[] args) {
        String s = "Hello world";
        int len = new Day03_01().lengthOfLastWord(s);
        System.out.println(len);
        long round = Math.round(2.4);
        System.out.println(round);
    }
}
