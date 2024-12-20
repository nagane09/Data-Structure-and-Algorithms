/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
  
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int a=target-nums[i];
            if(map.containsKey(a))
            {
                return new int[]{map.get(a),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }

    public static void main(String[] args)
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int target=sc.nextInt();

        int[] nums=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            nums[i]=arr.get(i);
        }
        int[] result=obj.twoSum(nums,target);

        System.out.println('['+result[0]+','+result[1]+']');
    }
}
