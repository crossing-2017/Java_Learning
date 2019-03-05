package chapter6;

/**
 * leetCode第一题
 * @author Crossing
 * @date 2019-03-05
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] sums = new int[2];
        for(int i = 0 ; i <nums.length; i++){
            for(int j = i+1; j <nums.length; j++){
                if(target==(nums[i] + nums[j])){
                    sums[0] = i;
                    sums[1] = j;
                }
            }
        }
        return sums;
    }

    public static void main(String[] args) {

        int [] nums = new int[]{2, 3, 5, 6};
        //System.out.println(nums[0]);
        int target = 9;
        Solution solution = new Solution();
        int[] ints = solution.twoSum(nums, target);
        for (int num :
                ints) {
            System.out.println(num);
        }
    }
}
