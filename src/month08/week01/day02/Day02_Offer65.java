package month08.week01.day02;

public class Day02_Offer65 {
    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        int res = new Day02_Offer65().add(2, 2);
        System.out.println(res);
    }
}
