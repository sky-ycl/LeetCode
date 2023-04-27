package 蓝桥杯.ycl.week01.day03;

public class Day03_02 {
    public static void main(String[] args) {
        //统计数量
        int count=0;
        for(int i=2022;i<=2022222022;i++) {
            if(isHuiwen(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isHuiwen(int num) {
        String s=num+"";
        int left=0;
        int right=s.length()-1;
        while(left<=right) {
            if(s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
