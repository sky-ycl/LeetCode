package month04.week01.day03;

public class Day03_2427 {
    public int commonFactors(int a, int b) {
        int min = Math.min(a, b);
        int count=0;
        for (int i =1 ; i < min; i++) {
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count+1;
    }
}
