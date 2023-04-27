package month02.week03.day01;
/*给你一个整数 x ，如果 x 是一个回文整数，
返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
例如，121 是回文，而 123 不是。
*/
public class Day01_9 {
    public boolean isPalindrome(int x) {
        //将整数转换为字符串
        String s=x+"";
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right--)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
