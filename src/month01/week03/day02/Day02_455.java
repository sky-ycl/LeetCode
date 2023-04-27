package month01.week03.day02;

import java.util.Arrays;

/*假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；
并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，
这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
*/
public class Day02_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        //表示孩子的数量
        int count = 0;
        int tmp = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = tmp; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    count++;
                    tmp = j + 1;
                    break;
                }
            }
            if (tmp == s.length) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {7, 8, 9, 10};
        int[] s = {5, 6, 7, 8};
        int[] copy = Arrays.copyOf(g, g.length);
        System.out.println(Arrays.toString(copy));
        int count = new Day02_455().findContentChildren(g, s);
        System.out.println(count);
    }
}
