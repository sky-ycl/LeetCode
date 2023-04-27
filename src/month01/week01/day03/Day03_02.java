package month01.week01.day03;
/*
* 删除有序数组的重复项(返回数组的新长度)*/
public class Day03_02 {
    //双指针解法
    public int  removeRepeatElement(int []arr){
        if(arr.length<2){
            return 1;
        }
        int j=1;
        //记录前一个数组的值
        int pre=arr[0];
        //遍历数组
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=pre){
                arr[j]=arr[i];
                pre=arr[j];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,4,5,5};
        int res = new Day03_02().removeRepeatElement(arr);
        System.out.println(res);
    }
}
