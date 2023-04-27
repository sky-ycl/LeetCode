package month02.week01.day04;

/*给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。*/
public class Day04_459 {
    //移位匹配
    public boolean repeatedSubstringPattern(String s) {
        String s1 = s + s;
        String substring = s1.substring(1, s1.length() - 1);
        if (substring.contains(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "aba";
        boolean b = new Day04_459().repeatedSubstringPattern(s);
        System.out.println(b);
    }

    //kmp算法
    public boolean repeatedSubstringPattern1(String s) {
        if (s.length() == 0) {
            return false;
        }
        int len = s.length();
        int[] next = kmpNext(s);
        // 最后判断是否是重复的子字符串，这里 next[len] 即代表next数组末尾的值
        if (next[len-1]>0&&len % (len - next[len - 1]) == 0) {
            return true;
        }else{
            return false;
        }
    }

    public int[] kmpNext(String s) {
        int[] next = new int[s.length()];
        next[0] = 0;
        //遍历字符串
        for (int i = 1, j = 0; i < s.length(); i++) {
            //前后缀不相同的情况下
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            //前后缀相同的情况下
            if (s.charAt(i) == s.charAt(j)) {
                j++;
                next[i] = j;
            }
        }
        return next;
    }
}
