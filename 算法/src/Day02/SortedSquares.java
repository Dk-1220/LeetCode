package Day02;

/**
 * 977. 有序数组的平方
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class SortedSquares {
    public static void main(String[] args) {
//        int[] nums = {-4, -1, 0, 3, 10};
//        int[] nums = {-7,-3,2,3,11};
        int[] nums = {-1};
        int[] sortedSquares = sortedSquares(nums);
        for (int i = 0; i < sortedSquares.length; i++) {
            System.out.print(sortedSquares[i] + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0, right, index = 0, length = nums.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            if (nums[i] > 0 || i == length - 1) {
                left = i - 1;
                break;
            }
        }

        right = left + 1;

        while (left >= 0 || right < length) {
            int leftNum = Integer.MAX_VALUE, rightNum = Integer.MAX_VALUE;
            if (left >= 0) {
                leftNum = nums[left] * nums[left];
            }

            if (right < length) {
                rightNum = nums[right] * nums[right];
            }

            if (leftNum < rightNum) {
                result[index++] = leftNum;
                left--;
            } else if (leftNum > rightNum) {
                result[index++] = rightNum;
                right++;
            } else {
                result[index++] = leftNum;
                result[index++] = rightNum;
                left--;
                right++;
            }
        }


        return result;
    }
}
