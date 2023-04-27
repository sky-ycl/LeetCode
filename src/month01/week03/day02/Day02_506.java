package month01.week03.day02;

import java.util.Arrays;

public class Day02_506 {
    //暴力解法
    public String[] findRelativeRanks(int[] score) {
        //复制原来的数组
        int[] newArr = Arrays.copyOf(score, score.length);
        //将新数组排序
        Arrays.sort(newArr);
        String[] str = new String[score.length];
        //记录名次
        int tmp = 0;
        //遍历数组
        for (int i = newArr.length - 1; i >= 0; i--) {
            for (int j = 0; j < score.length; j++) {
                if (score[j] == newArr[i]) {
                    tmp++;
                    if(tmp==1){
                        str[j]="Gold Medal";
                        break;
                    }else if(tmp==2){
                        str[j]="Silver Medal";
                    }else if(tmp==3){
                        str[j]="Bronze Medal";
                    }
                    else{
                        String s=tmp+"";
                        str[j]=s;
                    }
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int[] score = new int[]{10,3,8,9,4};
        String[] relativeRanks = new Day02_506().findRelativeRanks(score);
        //"Gold Medal","5","Bronze Medal","Silver Medal","4"]
        System.out.println(Arrays.toString(relativeRanks));
        String s = String.valueOf(1);

    }
}
