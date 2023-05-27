package interview.tx;

public class Demo2 {

    public int minOperations(String str) {
        return Math.min(getMinCount(str,'0'),getMinCount(str,'1'));
    }

    public int getMinCount(String str, char s) {//s表示0或者1
        int count = 0;
        //遍历str
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                continue;
            } else {
                if (i + 1 < str.length() && str.charAt(i + 1) != s) {
                    i++;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int res = new Demo2().minOperations("1000110");
        System.out.println(res);
    }
}
