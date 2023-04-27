package month12.week01.day04;

public class day04_01 {
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            String str=s.substring(i,i+1);
            for (int j = i+1; j < s.length(); j++) {
                String str1=s.substring(j,j+1);
                if(str.equals(str1)){
                    return i;
               }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="leetcode";
        int num=firstUniqChar(s);
        System.out.println(num);

    }
}
