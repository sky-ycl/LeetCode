package month02.week01.day01;

        import java.util.LinkedList;
        import java.util.List;

public class Day01_93 {
    List<String> list = new LinkedList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4 || s.length() > 12) {
            return list;
        }
        backTrack(s, 0, 0, 4);
        return list;
    }

    public void backTrack(String s, int startIndex, int pointNum, int duan) {
        if (pointNum == 3) {
            //判断最后一段是否符合
            if (isTrue(s, startIndex, s.length() - 1)) {
                list.add(s);
            }
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            //剪枝
            int duanNum = duan - 1;
            int len = (s.length() - i - 1);
            if (len <= 3 * duanNum) {
                if (isTrue(s, startIndex, i)) {
                    pointNum++;
                    s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                    backTrack(s, i + 2, pointNum, duanNum);
                    pointNum--;
                    s = s.substring(0, i + 1) + s.substring(i + 2);
                } else {
                    break;
                }

            }
        }
    }

    // 判断字符串s在左闭⼜闭区间[start, end]所组成的数字是否合法
    public boolean isTrue(String s, int start, int end) {
        //长度不符合
        if ((end - start) > 3 || (end - start) < 0) {
            return false;
        }
        //0开头的数字不合法
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        //判断数组是否符合
        int num = 0;
        for (int i = start; i <= end; i++) {
            num = num * 10 + s.charAt(i) - '0';
        }
        if (num > 255) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0000";
        List<String> list = new Day01_93().restoreIpAddresses(s);
        System.out.println(list);
    }
}
