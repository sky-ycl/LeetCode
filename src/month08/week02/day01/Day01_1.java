package month08.week02.day01;

import java.math.BigDecimal;
import java.util.Scanner;

public class Day01_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum=0;
        int size=0;
        String[] nums = scan.nextLine().split(" ");
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            Double num = Double.valueOf(nums[i]);
            size+=num;
            sum+=num*(i+1);
        }
        double avg=sum/size;
        int index=String.valueOf(avg).indexOf(".");
        String s = String.valueOf(avg).substring(0, index+2);
        System.out.println(s);
    }
}
