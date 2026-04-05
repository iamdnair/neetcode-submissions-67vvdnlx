class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stk.push(c);
            }
            else{
            if(stk.isEmpty()){//({})
                return false;
            }
                char t= stk.pop();
                if(t=='(' && c!=')' || t=='[' && c!=']' || t=='{' && 
                c!='}'){
                    return false;
                }
            }
        }
        return stk.isEmpty();
        
    }
}
