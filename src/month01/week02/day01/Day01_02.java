package month01.week02.day01;

import java.util.Arrays;

/*编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
*/
public class Day01_02 {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        for (i=0,j=s.length-1;i<j;i++,j--){
            char temp=s[j];
            s[j]=s[i];
            s[i]=temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char []s={'h','e','l','l','o'};
        new Day01_02().reverseString(s);
    }
}
