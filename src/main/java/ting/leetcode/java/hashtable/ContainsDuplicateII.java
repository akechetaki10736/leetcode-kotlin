package ting.leetcode.java.hashtable;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null && Math.abs(map.get(nums[i]) - i) <= k)
                    return true;
            map.put(nums[i], i);
        }
        return false;
    }
}
