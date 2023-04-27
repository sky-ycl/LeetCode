package month04.week03.day02;

public class Day02_1732 {
    public int largestAltitude(int[] gain) {
        int[] res=new int[gain.length+1];
        int max=res[0];
        for (int i = 0; i < gain.length; i++) {
            res[i+1]=res[i]+gain[i];
            max=Math.max(res[i+1],max);
        }
        return max;
    }
}
