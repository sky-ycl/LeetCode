package month06.week02.day01;

/*回环句*/
public class Day01_2490 {
    public boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");
        int n = s.length;
        //记录第一个单词的第一个字符
        char startStr = s[0].charAt(0);
        //记录最后一个单词的最后一个字符
        String str = s[n - 1];
        char eddStr = str.charAt(str.length() - 1);
        if(startStr!=eddStr){
            return false;
        }
        for (int i = 0; i < n-1; i++) {
            String s1 = s[i];
            String s2 = s[i + 1];
            //比较前一个单词的最后一个字符和下一个单词的第一个字符是否相等
            if(s1.charAt(s1.length()-1)!=s2.charAt(0)){
                return false;
            }
        }
        return true;
    }
}
