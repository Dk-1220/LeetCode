package Day05;

import java.util.HashSet;
import java.util.Set;

/**
 * 409. 最长回文串（贪心，可用hash表解决）
 * 给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。
 * <p>
 * 在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
//        String s = "a";
//        String s = "bb";
        System.out.println(longestPalindrome2(s));
    }

    /**
     * 哈希表
     *
     * @param s
     * @return
     */
    public static int longestPalindrome(String s) {
        int length = s.length(), result = 0;
        Set<Character> hashSet = new HashSet<>();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (!hashSet.add(c)) {
                hashSet.remove(c);
                result += 2;
            }
        }

        return result < length ? result + 1 : result;
    }

    public static int longestPalindrome2(String s) {
        int length = s.length(), count = 0;
        int[] ans = new int[128];  // 记录字母出现次数

        for (int i = 0; i < length; i++) {
            ans[s.charAt(i)]++;
        }

        for (int an : ans) {
            count += an % 2;
        }

        return count == 0 ? length : length - count + 1;
    }
}
