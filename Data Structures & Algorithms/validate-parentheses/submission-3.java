class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1) return false;
        Stack<Character> stk = new Stack();
      for(int i=0; i<s.length();i++){
        char ch= s.charAt(i);
        if(ch== '(' || ch=='{' || ch=='['){
          stk.push(ch);
        }
        else{
             if(stk.empty()){
            return false;
        }
            char top= stk.pop();
            if(ch=='}' && top !='{' || ch==')' && top != '(' || ch==']' && top != '['){
                return false;
            }
        }
      }
      return stk.empty();
    }
}
