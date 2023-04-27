package month12.week02.day05;

/*
* 给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。
在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。
* 回文串：(一个正着读和反着读都一样的字符串)
*/
public class day05_01 {
    public static int longestPalindrome(String s) {
        //创建一个数组，该数组存放s字符串的每一个字符数量。
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            arr[a]++;
        }
        //count表示最长回文串的长度
        int count = 0;
        //遍历arr数组
        for (int i : arr) {
            count += i / 2 * 2;
            //因为在一个回文串中，只有最多一个字符出现了奇数次，其余的字符都出现偶数次
            if (i % 2 == 1 && count / 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        int length = longestPalindrome(s);
        System.out.println(length);
    }
}
