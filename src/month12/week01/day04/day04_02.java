package month12.week01.day04;

public class day04_02 {
    /*给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
    如果可以，返回 true ；否则返回 false 。
    magazine 中的每个字符只能在 ransomNote 中使用一次。
    */
    /*思路：
    1、如果ransomNote的长度大于magazine的长度，则返回false
    2、创建一个数组cnt,统计magazine和的每个字符的数量
    3、向magazine取出字符给ransomNote，每取一次，cnt就减一，如果cnt<0就返回false
     * */
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c-'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c-'a']--;
            if(cnt[c-'a']<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //ransomNote = "a", magazine = "b"
        String ranSomeNote="abc";
        String magazine="abcd";
        boolean result=canConstruct(ranSomeNote,magazine);
        System.out.println(result);
    }
}
