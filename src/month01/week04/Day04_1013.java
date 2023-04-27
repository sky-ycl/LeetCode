package month01.week04;

/*给你一个整数数组 arr，只有可以将其划分为三个和相等的 非空 部分时才返回 true，否则返回 false。
形式上，如果可以找出索引 i + 1 < j 且满足 
(arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1]) 就可以将数组三等分。
*/
public class Day04_1013 {
    public boolean canThreePartsEqualSum(int[] arr) {
        //先计算出数组总和
        int sum = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        //计算每组的值
        int val=sum/3;
        //统计等于val的数树
        int count=0;
        //当前组的值
        int groupVal=0;
        //再遍历数组,进行分组
        for (int i = 0; i < arr.length; i++) {
            groupVal+=arr[i];
            if(groupVal==val){
                groupVal=0;
                count++;
            }
        }
        //count>=3 是防止数组全是0
        if(count>=3){
            return true;
        }else{
            return false;
        }
    }
}
