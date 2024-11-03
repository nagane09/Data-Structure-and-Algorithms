class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        int []arr=new int[26];     //Automatically initialized to zero
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int idx=ch-'a';
            arr[idx]++;
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            int idx=ch-'a';
            if(arr[idx]==0)
            {
                return false;
            }
            arr[idx]--;
        }
        return true;
    }
}
