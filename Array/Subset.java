import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        

        for (int i = start; i < nums.length; i++) 
        {
            // Add nums[i] to the current subset
            current.add(nums[i]);
            // Recurse with the next element
            backtrack(nums, i + 1, current, result);
            // Backtrack, remove the last element added
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        
        List<List<Integer>> subsets = sol.subsets(nums);
        
        // Print all subsets
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
