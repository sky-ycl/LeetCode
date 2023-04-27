package month12.week02.Day04;

/*给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。
思路：具体实现也不复杂，我们定义两个指针 i 和 j 分别指向 num1和num2的末尾，
即最低位，同时定义一个变量 \textit{add}add 维护当前是否有进位，然后从末尾到开头逐位相加即可。
*/
public class Day04_02 {
        public String addStrings(String num1, String num2) {
            //获取num1和num2的个位数
            int i=num1.length()-1;
            int j=num2.length()-1;
            int add=0;
            StringBuffer stringBuffer = new StringBuffer();
            //循环条件
            while(i>=0||j>=0||add!=0){
                int x=i>=0? num1.charAt(i)-'0':0;
                int y=j>=0? num2.charAt(j)-'0':0;
                int result=x+y+add;
                stringBuffer.append(result%10);
                add=result/10;
                i--;
                j--;
            }
            // 计算完以后的答案需要翻转过来
            stringBuffer.reverse();
            return stringBuffer.toString();
        }
    public static void main(String[] args) {
        String num1="129";
        String num2="11";
        String res=new Day04_02().addStrings(num1,num2);
        System.out.println(res);
    }
}
