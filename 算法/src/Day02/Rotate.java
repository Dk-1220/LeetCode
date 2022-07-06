package Day02;

/**
 * 189. 轮转数组
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class Rotate {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};int k = 3;
        int[] nums = {-1, -100, 3, 99};int k = 2;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        int count = 0, i = 0, temp = nums[i], length = nums.length;

        while (count <= length) {
            int j = (i + k) % length;
            int t1 = nums[j];
            nums[j] = temp;
            temp = t1;
            i = j;
            count++;
        }
    }
}
