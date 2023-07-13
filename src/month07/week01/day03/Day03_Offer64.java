package month07.week01.day03;

public class Day03_Offer64 {
    public int sumNums(int n) {
        if(n==1){
            return 1;
        }
        return sumNums(n-1)+n;
    }

    public static void main(String[] args) {
        int sum = new Day03_Offer64().sumNums(9);
        System.out.println(sum);
    }
}
