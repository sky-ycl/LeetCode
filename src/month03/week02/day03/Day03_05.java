package month03.week02.day03;

/*
给你一个字符串 s，找到 s 中最长的回文子串。
如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
*/
public class Day03_05 {
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        int maxLen=0;
        String []arr=new String[1];
        for (int i = 0; i < s.length(); i++) {
            for(int j=i;j<s.length();j++){
                if(isHuiWen(s,i,j)){
                    if(j-i+1>maxLen){
                        maxLen=j-i+1;
                        arr[0]=s.substring(i,j+1);
                    }
                }
            }
        }
        return arr[0];
    }

    public boolean isHuiWen(String s, int startIndex, int eddIndex) {
        int left = startIndex;
        int right = eddIndex;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = new Day03_05().longestPalindrome("babad");
        System.out.println(s);
    }
}
