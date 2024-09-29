class Solution {
    public int rev(int x)
    {
        int res=0;
        while(x>0)
        {
            int a=x%10;
            res=res*10+a;
            x=x/10;
        }
        return res;
    }
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int abc=rev(x);
	    return x==abc;
    }
}
