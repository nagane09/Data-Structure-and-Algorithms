class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> scc= new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='(' || ch[i]=='[' || ch[i]=='{')
            {
                scc.push(ch[i]);
            }
            else
            {
                if(scc.isEmpty())
                {
                    return false;
                }
                char top=scc.pop();
                if(ch[i]==')' && top!='(' ||
                    ch[i]==']' && top!='[' ||
                    ch[i]=='}' && top!='{' 
                     )
                {
                    return false;
                }
            }
        }
        return scc.isEmpty();

    }
}

/*Dry Run Example: "()[]{}":
'(' → push to stack (['('])
')' → pop from stack, matches '(', stack is []
'[' → push to stack (['['])
']' → pop from stack, matches '[', stack is []
'{' → push to stack (['{'])
'}' → pop from stack, matches '{', stack is []
Result: true()*/
