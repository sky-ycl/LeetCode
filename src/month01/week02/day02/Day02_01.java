package month01.week02.day02;

/*字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，
该函数将返回左旋转两位得到的结果"cdefgab"。
*/
public class Day02_01 {
    public String reverseLeftWords(String s, int n) {
        int index=0;
        char[] chars = new char[s.length()];
        for (int i = n; i < s.length(); i++) {
            chars[index++]=s.charAt(i);
        }
        for (int j=0;j<n;j++){
            chars[index++]=s.charAt(j);
        }
        String s1 = new String(chars,0,s.length());
        return s1;
    }
    public static void main(String[] args) {
        String str="abcdefg";
        String s = new Day02_01().reverseLeftWords(str,2);
        System.out.println(s);
    }
}
