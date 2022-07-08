package Day02;


/**
 * 189. 轮转数组
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class Rotate {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};int k = 3;
//        int[] nums = {-1, -100, 3, 99};int k = 2;
        int[] nums = {1};int k = 1;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        int end = nums.length - 1;
        k = k % nums.length;
        if (k > 0) {
            reverse(nums, 0, end);  // 翻转整个数组
            reverse(nums, 0, k - 1);  // 翻转前k个
            reverse(nums, k, end);  // 反转k个后面
        }
    }

    public static void reverse(int[] nums, int start, int end) {
        int middle = (end - start) / 2;
        for (int i = 0; i <= middle; i++) {
            int x = start + i, y = end - i;
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
        }
    }
}
