package month01.week02.day01;

/*请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Day01_03 {
    public String replaceSpace(String s) {
        //创建一个数组，该数组的长度是s的3倍
        char[] array = new char[s.length() * 3];
        //遍历s
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String s1 = new String(array, 0, size);
        return s1;
    }

    public static void main(String[] args) {
        String s="We are happy.";
        String s1 = new Day01_03().replaceSpace(s);
        System.out.println(s1);
    }
}
