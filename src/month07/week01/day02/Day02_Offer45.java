package month07.week01.day02;


public class Day02_Offer45 {
    public String minNumber(int[] nums) {
        String[] res =new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i]=String.valueOf(nums[i]);
        }
        quickly(res,0,nums.length-1);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            builder.append(res[i]);
        }
        return builder.toString();
    }

    public void quickly(String[] res, int left, int right) {
        if (left > right) {
            return;
        }
        String val = res[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && getNum(res[i], val) >= getNum(val, res[i])) {
                i++;
            }
            while (i < j && getNum(val, res[j]) < getNum(res[j], val)) {
                j--;
            }
        }
        swap(res,left,j);
    }

    public Long getNum(String s1, String s2) {
        return Long.valueOf(s1 + s2);
    }

    //数组交换
    public void swap(String[] res, int i, int j) {
        String temp = res[j];
        res[j] = res[i];
        res[i] = temp;
    }

    public static void main(String[] args) {
       int[] nums={1,2,3,1};
        String s = new Day02_Offer45().minNumber(nums);
        System.out.println(s);
    }
}
