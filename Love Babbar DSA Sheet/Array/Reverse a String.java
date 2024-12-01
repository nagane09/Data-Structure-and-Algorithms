//if Parameter is String type
class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder ans=new StringBuilder(s.length());
        
        int i=s.length()-1;
        
        while(i>=0)
        {
            ans.append(s.charAt(i));
            i--;
            
        }
        return ans.toString();
        
    }
}

//if parameter is array of char
class Solution {
    public void reverseString(char[] s) {
        int st=0,end=s.length-1;

        while(st<end)
        {
            char temp=s[st];
            s[st]=s[end];
            s[end]=temp;
            st++;
            end--;
        }
    }
}
