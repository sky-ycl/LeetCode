package month01.week05.day02;

public class Day02_1539 {
    public int findKthPositive(int[] arr, int k) {
        int autoNum = 1;
        int missNum = 0;
        int missCount = 0;
        int temp = 0;
        while (missCount < k) {
            if (temp < arr.length && arr[temp] == autoNum) {
                temp++;
            } else {
                missNum = autoNum;
                missCount++;
            }
            autoNum++;
        }
        return missNum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int num = new Day02_1539().findKthPositive(arr, 2);
        System.out.println(num);
    }
}
