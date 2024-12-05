/* an integer n, find its factorial. Return a list of integers denoting the digits that make up the factorial of n.
Examples:
Input: n = 5
Output: [1, 2, 0]
Explanation: 5! = 1*2*3*4*5 = 120*/

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        result.add(1);
        
        for(int i=2;i<=n;i++)
        {
            int carry=0;
            for(int j=0;j<result.size();j++)
            {
                int ans=result.get(j)*i+carry;
                result.set(j,ans%10);
                carry=ans/10;
            }
            while(carry>0)
            {
                result.add(carry%10);
                carry/=10;
            }
        }
        Collections.reverse(result);
        return result;
    }
}

/*
