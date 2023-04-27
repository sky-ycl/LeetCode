package month11.week01.day3;

public class Search {
    public int searchIndex(int []nums,int target){
        for (int i = 0; i < nums.length; i++) {
            if(target==nums[i]){
                return i;
            }
        }
        return -1;//表示没找到
    }

    public static void main(String[] args) {
        int []nums=new int[]{1,3,5,6};
        Search search = new Search();
        int index=search.searchIndex(nums,0);
        System.out.println("该数字在数组的第"+index+"个位置");
    }
}
