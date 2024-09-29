import java.util.*;
class Solution 
{
    public int reverse(int x) 
    {
        int res=0,num1;
        int original=x;
        x=Math.abs(x);   //set the value to positive value

        while(x>0)
        {
            num1=x%10;
            if (res > (Integer.MAX_VALUE - num1) / 10) 
            {
                return 0; // Return 0 on overflow
            }
            res=res*10+num1;
            x=x/10;

        }
        if(original<0)
        {
            res*=-1;
        }
        return res;
    }
}
