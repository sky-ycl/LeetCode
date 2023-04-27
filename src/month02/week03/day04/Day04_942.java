package month02.week03.day04;

/*由范围 [0,n] 内所有整数组成的 n + 1 个整数的排列序列可以表示为长度为 n 的字符串 s ，
其中:
如果 perm[i] < perm[i + 1] ，那么 s[i] == 'I' 
如果 perm[i] > perm[i + 1] ，那么 s[i] == 'D' 
给定一个字符串 s ，重构排列 perm 并返回它。如果有多个有效排列perm，则返回其中 任何一个 。
*/
public class Day04_942 {
    public int[] diStringMatch(String s) {
        int []arr=new int[s.length()+1];
        int left=0,right=arr.length-1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='I'){
                arr[i]=left;
                left++;
            }else{
                arr[i]=right;
                right--;
            }
        }
        //此时left==right
        arr[arr.length-1]=left;
        return arr;
    }
}
