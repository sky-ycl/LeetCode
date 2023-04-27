package month02.week03.day06;
/*
* 0-9的卡片各有2021张，从1开始拼数字
* 每拼一个就保存起来，比如10，就用了卡片0和1
* */
public class Day06_01 {
    public int getNum() {
        int[] numArr = new int[10];
        for (int i = 0; i <= 9; i++) {
            numArr[i] = 2021;
        }
        for (int num = 1; ; num++) {
            if (!isReach(numArr, num)) {
                return num - 1;
            }
        }
    }

    public boolean isReach(int[] numArr, int num) {
        while (num != 0) {
            if (numArr[num % 10] <= 0) {
                return false;
            }
            numArr[num % 10]--;
            num = num / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = new Day06_01().getNum();
        System.out.println(num);
    }
}
