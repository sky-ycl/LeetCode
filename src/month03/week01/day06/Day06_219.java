package month03.week01.day06;

import java.text.SimpleDateFormat;
import java.util.Date;

/*给你一个整数数组nums 和一个整数k ，判断数组中是否存在两个 不同的索引i和j ，
满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
输入：nums = [1,2,3,1], k = 3
输出：true
示例 2：

输入：nums = [1,0,1,1], k = 1
输出：true
示例 3：

输入：nums = [1,2,3,1,2,3], k = 2
输出：false

*/
public class Day06_219 {
    public static void main(String[] args) {
        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int year=2000;
        int mon=1;
        int day=1;
        int weekend=6;
        int km=0;

        while (true){
            // 先判断是否为闰年
            if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0){
                month[2]=29;
            }
            else
            {
                month[2]=28;
            }
            //遍历每一天
            if(day==1||weekend==1){
                km=km+2;
            }
            else {
                km++;
            }
            //下一天和星期变化
            day++;
            weekend++;
            //日期和法化

            if(day>month[mon]){
                day=1;
                mon++;
                if(mon>12){
                    year++;
                    mon=1;
                }

            }

            if(weekend>7){
                weekend%=7;
            }
            //截至2020年10月一号 最后这一天也要加上
            if(year==2020&&mon==10&&day==1){
                km+=2;
                System.out.println(weekend);
                break;
            }

        }
    }
}
