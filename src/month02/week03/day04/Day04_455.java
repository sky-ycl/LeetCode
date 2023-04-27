package month02.week03.day04;

import java.util.Arrays;

/*假设你是一位很棒的家长，想要给你的孩子们一些小饼干。
但是，每个孩子最多只能给一块饼干。
对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；
并且每块饼干 j，都有一个尺寸 s[j] 。
如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你
的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
*/
public class Day04_455 {
    //贪心算法
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        //记录满足小孩的数量
        int count=0;
        //饼干数量为0时
        if(s.length==0){
            return 0;
        }
        //记录第几块饼干
        int index=s.length-1;
        for (int i = g.length - 1; i >= 0; i--) {
            if(s[index]>=g[i]){
                count++;
                index--;
            }
            //倘若饼干远大于小孩的数量并且都满足
            if(index==-1){
                break;
            }
        }
        return count;
    }
}
