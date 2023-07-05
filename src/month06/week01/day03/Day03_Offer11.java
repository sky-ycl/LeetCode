package month06.week01.day03;

public class Day03_Offer11 {
    public int minArray(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n-1; i++) {
            if(numbers[i]>numbers[i+1]){
                return numbers[i+1];
            }
        }
        return numbers[0];
    }
}
