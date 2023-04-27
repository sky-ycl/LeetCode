package month01.week03.day04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day04_860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int len = bills.length;
        for (int i = 0; i < len; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else if (bills[i] == 20) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int []bills={5,5,5,10,20};
        boolean res = new Day04_860().lemonadeChange(bills);
        System.out.println(res);
    }
}
