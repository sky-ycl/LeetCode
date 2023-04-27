package month01.week02.day03;

import java.util.Scanner;

public class Day03_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入人数");
        int n = scan.nextInt();
        System.out.println("请输入成绩");
        int passNum=0;
        int excellentNum=0;
        for (int i = 0; i < n; i++) {
            int score = scan.nextInt();
            if(score>=60) {
                passNum++;
            }
            if(score>=85) {
                excellentNum++;
            }
        }
        int passRate=(passNum*100)/n;
        int excellentRate=(excellentNum*100)/n;
        System.out.println("及格率"+passRate+"%");
        System.out.println("优秀率"+excellentRate+"%");
        scan.close();
    }
}
