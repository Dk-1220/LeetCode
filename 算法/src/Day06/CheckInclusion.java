package Day06;

import java.util.HashMap;
import java.util.Map;

/**
 * 567. 字符串的排列（未完成）
 * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
 * <p>
 * 换句话说，s1 的排列之一是 s2 的 子串 。
 */
public class CheckInclusion {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int left = 0, right = 0, length1 = s1.length(), length2 = s2.length();
        Map<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < length1; i++) {
            char ch = s1.charAt(i);
            if (!hashMap.containsKey(ch)) {
                hashMap.put(ch, 1);
            } else {
                hashMap.put(ch, hashMap.get(ch) + 1);
            }
        }

        for (; right < length2; right++) {
            char c = s2.charAt(right);
            if (hashMap.size() > 0 && !hashMap.containsKey(c)) {
                left = right;
            }else {

            }
        }

        return false;
    }
}
