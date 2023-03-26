package Day01;

/**
 * 35. 搜索插入位置
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class SearchInsert {
    // 找到大于或等于target的第一个数（大于等于：缩紧右边，小于等于：缩紧左边）
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0,  r = n - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (l == n - 1 && nums[l] < target) return n;  // 最右边界仍不满足条件
        return l;
    }
}
