package month08.week04.day02;

public class Day02_1 {
    public int furthestDistanceFromOrigin(String moves) {
        int LCount = 0;
        int RCount = 0;
        int _Count = 0;
        int res = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'L') LCount++;
            if (c == 'R') RCount++;
            if (c == '_') _Count++;
        }
        res = LCount > RCount ? LCount - RCount + _Count : RCount - LCount + _Count;
        return res;
    }

    public static void main(String[] args) {
        int i = new Day02_1().furthestDistanceFromOrigin("_______");
        System.out.println(i);
    }
}
