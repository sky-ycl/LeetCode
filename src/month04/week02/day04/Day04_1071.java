package month04.week02.day04;


/*对于字符串s 和t，只有在s = t + ... + t（t 自身连接 1 次或多次）时，我们才认定“t 能除尽 s”。

给定两个字符串str1和str2。返回 最长字符串x，要求满足x 能除尽 str1 且X 能除尽 str2 。

*/
public class Day04_1071 {
    public String gcdOfStrings(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int gcd = gcd(n, m);
        String s = str2.substring(0, gcd);
        if(check(s,str1) && check(s,str2)){
            return s;
        }
        return "";
    }

    public boolean check(String s,String s1){
        int len=s1.length()/s.length();
        String tmp="";
        for (int i = 0; i < len; i++) {
            tmp+=s;
        }
        return tmp.equals(s1);
    }
    public int gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
