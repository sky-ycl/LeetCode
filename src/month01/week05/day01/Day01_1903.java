package month01.week05.day01;

public class Day01_1903 {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i]=='6'){
                array[i]='9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(array));
    }
    public static void main(String[] args) {
        String num="4206";
        int at=num.charAt(2);
        System.out.println(at);
        System.out.println(new Day01_1903().largestOddNumber(num));
        int nums=9669;
        System.out.println(new Day01_1903().maximum69Number(nums));
    }
}
