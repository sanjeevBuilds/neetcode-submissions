class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st=new Stack<>();
        int result=0;
        for(String c: tokens)
        {
            if(c.equals("+")||c.equals("*")||c.equals("-")||c.equals("/"))
            {
                int a=st.pop();
                int b=st.pop();

                if(c.equals("+"))
                {
                    result = a+b;
                    st.push(result);
                }
                if(c.equals("*"))
                {
                    result= a*b;
                    st.push(result);

                }
                if(c.equals("-"))
                {
                    result= b-a;
                    st.push(result);
                }
                if(c.equals("/"))
                {
                    result = b/a;
                    st.push(result);
                }
                result=0;
            }else
            {
            st.push(Integer.parseInt(c));
            }
        }


        return st.pop();
    }
}
