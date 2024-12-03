/*Given an array arr of integers, find all the elements that occur more than once in the array. Return the result in ascending order. If no element repeats, return an empty array.

Examples:
Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.*/

/*Dry Run :-
After processing 4: freq = {4=1}
After processing 3: freq = {4=1, 3=1}
After processing 2: freq = {4=1, 3=1, 2=1}
After processing 7: freq = {4=1, 3=1, 2=1, 7=1}
After processing 8: freq = {4=1, 3=1, 2=1, 7=1, 8=1}
After processing 2: freq = {4=1, 3=1, 2=2, 7=1, 8=1}
After processing 3: freq = {4=1, 3=2, 2=2, 7=1, 8=1}
After processing 1: freq = {4=1, 3=2, 2=2, 7=1, 8=1, 1=1}
Final freq map: {4=1, 3=2, 2=2, 7=1, 8=1, 1=1}*/


class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        Map<Integer,Integer> freq=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        
        for(int i:arr)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(Integer i:freq.keySet())
        {
            if(freq.get(i)>1)
            {
                ans.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
