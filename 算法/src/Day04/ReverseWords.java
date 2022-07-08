package Day04;

/**
 * 557. 反转字符串中的单词 III
 * 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */
public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int left = 0, length = chars.length;

        while (left < length) {
            if (chars[left] != ' ') {
                int right = left;
                while (right < length - 1) {
                    if (chars[right + 1] == ' ') {
                        break;
                    }
                    right++;
                }
                // 反转子串
                int mid = (right - left) / 2;
                for (int i = 0; i <= mid; i++) {
                    char temp = chars[left + i];
                    chars[left + i] = chars[right - i];
                    chars[right - i] = temp;
                }
                left = right + 1;
            }
            left++;
        }

        return new String(chars);
    }

}
