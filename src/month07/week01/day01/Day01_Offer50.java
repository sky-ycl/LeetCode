package month07.week01.day01;

public class Day01_Offer50 {
    public char firstUniqChar(String s) {
        int[] nums=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            nums[c-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(nums[c-'a']==1){
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s="leetcode";
        Day01_Offer50 day01Offer50 = new Day01_Offer50();
        char c = day01Offer50.firstUniqChar(s);
        System.out.println(c);
    }
}
