class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c:s.toCharArray()){
            if((c=='(') || (c=='{') || (c=='[')){
                stk.push(c);//((()))
            } else{
            if(stk.empty())return false; //return false if stack is empty
            char top= stk.pop();
         if((c==')' && top!='(')|| (c=='}' && top!='{') || (c==']' && top!='['))
         return false;
        }
        }

     return stk.empty();   
    }
}
