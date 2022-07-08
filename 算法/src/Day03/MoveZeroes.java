package Day03;

/**
 * 283. 移动零（双指针）
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int x = 0, y = 0;
        while (y < nums.length) {
            if (nums[y] != 0) {
                int temp = nums[y];
                nums[y] = nums[x];
                nums[x] = temp;
                x++;
            }
            y++;
        }
    }
}
