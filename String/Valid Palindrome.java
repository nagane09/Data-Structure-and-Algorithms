class Solution 
{
    public boolean isPalindrome(String s) 
    {
        int st=0,end=s.length()-1;
        while(st<end)
        {
            char ch1=s.charAt(st);
            char ch2=s.charAt(end);
            
            if(!Character.isLetterOrDigit(ch1))
            {
                st++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch2))
            {
                end--;
                continue;
            }
            
            if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2))
            {
                return false;
            }
            st++;
            end--;
        }
        return true;


    }
}
