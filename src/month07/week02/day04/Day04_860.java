package month07.week02.day04;

/**
 * title: 柠檬水找零
 */
public class Day04_860 {
    public boolean lemonadeChange(int[] bills) {
        // 定义一个数组 money[0]表示5元 money[1]表示10元 money[2]表示20元
        int[] money=new int[2];
        for (int i = 0; i < bills.length; i++) {
            if(bills[i]==5){
                money[0]++;
            }
            if(bills[i]==10){
                if(money[0]<=0) return false;
                money[0]--;
                money[1]++;
            }
            if(bills[i]==20){
                //判断是否10元的零钱和5元的零钱
                if(money[1]>0 && money[0]>0){
                   money[0]--;
                   money[1]--;
                }else if(money[0]>=3){
                    money[0]-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
