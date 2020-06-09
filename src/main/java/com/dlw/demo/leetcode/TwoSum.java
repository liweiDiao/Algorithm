package com.dlw.demo.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * @Author diaoliwei
 * @Date 2019/2/13 14:04
 */
public class TwoSum {

    /**
     * 示例：给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    public int[] twoSum(int [] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i ++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[] {map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[1];
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int [] result = new int[2];
        for (int i = 0; i < numbers.length ; i ++) {
            int temp = target - numbers[i];
            if (map.containsKey(temp)) {
                result[0] = i;
                result[1] = map.get(temp);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String [] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2,11,15,7,3};
        int target = 9;
        int [] result = solution.twoSum2(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
