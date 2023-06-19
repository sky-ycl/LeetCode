package month05.week04.day05;

public class Day05 {
    public static int maxContinuousString(String s){
        if(s.length()==1 ||s.length()==0 ){
            return s.length();
        }
        //最长连续子串
        int maxLen=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='1'){
                maxLen=Math.max(right-left+1,maxLen);
            }else{
                left=right+1;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int i = Day05.maxContinuousString("10111111101111100111000111");
        System.out.println(i);
    }
}
