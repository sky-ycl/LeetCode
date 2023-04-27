package month01.week04;

/*给你一个表示某个正整数的字符串 number 和一个字符 digit 。
从 number 中 恰好 移除 一个 等于 digit 的字符后，找出并返回按 十进制 表示 最大 的结果字符串。
生成的测试用例满足 digit 在 number 中出现至少一次。
*/
public class Day04_2259 {
    public String removeDigit(String number, char digit) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(number);
        int index = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                index = i;
                if (i == number.length() - 1 || digit < number.charAt(i + 1)) {
                    break;
                }
            }
        }
        stringBuffer.deleteCharAt(index);
        return stringBuffer.toString();
    }
}
