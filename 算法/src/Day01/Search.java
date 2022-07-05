package Day01;

public class Search {
    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};int target = 9;
//        int[] nums = {-1, 0, 3, 5, 9, 12};int target = 2;
//        int[] nums = {5};int target = -5;
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid, result = -1;
        if (nums.length > 0) {
            while (true) {
                mid = (left + right) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    result = mid;
                    break;
                }

                // 已查找完或越界
                if (left > right) {
                    break;
                }
            }
        }
        return result;
    }
}
