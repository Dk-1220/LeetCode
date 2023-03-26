package Day06;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
//        String s = "abcabcbb";
//        String s = "bbbbb";
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = s.length(), left = 0, right = 0, max = 0;
        Set<Character> hashSet = new HashSet<>();

        for (; right < length; right++) {
            char ch = s.charAt(right);
            while (hashSet.contains(ch)) {
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(ch);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
