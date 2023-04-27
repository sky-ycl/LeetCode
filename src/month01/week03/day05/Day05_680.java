package month01.week03.day05;

/*给你一个字符串 s，最多 可以从中删除一个字符。
请你判断 s 是否能成为回文字符串：如果能，返回 true ；否则，返回 false 。
 */
public class Day05_680 {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return validPalindrome(s,left+1,right)||validPalindrome(s,left,right-1);
            }
        }
        return true;
    }
    public boolean validPalindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
