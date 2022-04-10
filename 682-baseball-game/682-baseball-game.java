class Solution {
    public int calPoints(String[] ops) {
        int result=0;
        Stack<Integer> st= new Stack();
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i].equals("+"))
            {
                int x=st.pop();
                int y=st.peek();
                st.push(x);
                st.push(x+y);
            }
            else if(ops[i].equals("C"))
                st.pop();
            else if(ops[i].equals("D"))
                st.push(2*st.peek());
            else
                st.push(Integer.parseInt(ops[i]));
        }
        while(!st.isEmpty())
            result+=st.pop();      
        return result;
        //TC: O(n) ---> for traversing entire ops.
        //SC: O(n)---> because we used stack.
    }
}