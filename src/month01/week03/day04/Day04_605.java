package month01.week03.day04;

public class Day04_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //表示还有多少花要插入
        int count = n;
        int len=flowerbed.length;
        if (count == 0) {
            return true;
        }
        for(int i=0;i<len;){
            if(flowerbed[i]==1){
                i+=2;
            }else if(i==len-1||flowerbed[i+1]==0){
                count--;
                i+=2;
            }else if(flowerbed[i+1]!=0){
                i+=3;
            }
            if(count==0){
                return true;
            }
        }
        return false;
    }
}
