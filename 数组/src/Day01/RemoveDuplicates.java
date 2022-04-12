package Day01;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

    public int removeDuplicatesOne(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        set.forEach(new Consumer<Integer>() {
            int i = 0;

            @Override
            public void accept(Integer data) {
                nums[i++] = data;
            }
        });

        return set.size();
    }
}
