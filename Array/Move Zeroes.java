class Solution {
    public void moveZeroes(int[] nums) {
        
        int pointer=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[pointer];
                nums[pointer]=nums[i];
                nums[i]=temp;

                pointer++;
            }
        }
    }

    public static void main(String[] args)
    {
        Solution sc=new Solution();
        ArrayList<Integer> numsList=new ArrayList<>();

        int[] nums = new int[numsList.size()];
        for (int i = 0; i < numsList.size(); i++) {
            nums[i] = numsList.get(i);  // Convert each element
        }
        
        sc.moveZeroes(nums);

        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]+" ");
        }
    }
}
