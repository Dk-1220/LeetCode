package Day02;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1};
        int val = 1;

        System.out.print("改变前：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("result：" + removeElement(nums, val));

        System.out.print("改变后：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int result = 0;

        for (int i = 0; i < len; i++) {
            int element = nums[i];

            if (element == val) {
                for (int j = i + 1; j < len; j++) {
                    if (nums[j] != element) {
                        nums[i] = nums[j];
                        nums[j] = element;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                result++;
            }
        }

        return result;
    }
}
