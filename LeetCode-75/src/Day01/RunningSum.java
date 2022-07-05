package Day01;

/**
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * <p>
 * 请返回 nums 的动态和。
 */
public class RunningSum {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {1, 2, 3, 4};
        nums = runningSum(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
