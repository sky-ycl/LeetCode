package month01.week03.day03;

import java.util.HashSet;
import java.util.Set;

/*如果一个密码满足以下所有条件，我们称它是一个 强 密码：
它有至少 8 个字符。
至少包含 一个小写英文 字母。
至少包含 一个大写英文 字母。
至少包含 一个数字 。
至少包含 一个特殊字符 。特殊字符为："!@#$%^&*()-+" 中的一个。
它 不 包含 2 个连续相同的字符（比方说 "aab" 不符合该条件，但是 "aba" 符合该条件）。
给你一个字符串 password ，如果它是一个 强 密码，返回 true，否则返回 false 。
*/
public class Day03_2299 {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasD = false, hasX = false, hasNum = false, hasSpecial = false;
        Set<Character> set = new HashSet<>();
        set.add('!');
        set.add('@');
        set.add('#');
        set.add('$');
        set.add('%');
        set.add('^');
        set.add('&');
        set.add('*');
        set.add('(');
        set.add(')');
        set.add('-');
        set.add('+');
        for (int i = 0; i < password.length(); i++) {
            if (i != password.length() - 1 && password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasD = true;
            }
            if (Character.isUpperCase(c)) {
                hasX = true;
            }
            if (Character.isDigit(c)) {
                hasNum = true;
            }
            if (set.contains(c)) {
                hasSpecial = true;
            }
        }
        return hasD && hasX && hasNum && hasSpecial;
    }

    public static void main(String[] args) {
        String password = "a1A!A!A!";
        boolean b = new Day03_2299().strongPasswordCheckerII(password);
        System.out.println(b);
    }
}
