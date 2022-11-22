package interview;

import java.util.Stack;

public class SymbolBalancing {
    
    public static int validParentheses(String str){

        Stack<Character> myStack = new Stack<>();
        
        while (true){
            
            for (Character ch : str.toCharArray()){
                if (ch != '(' && ch != ')' && ch != '{' && ch != '}' && ch != '[' && ch != ']' ){
                    return 0;
                } else if (ch == '(' || ch == '{' || ch == '[') {
                    myStack.push(ch);
                } else if (ch == ')' || ch == '}' || ch == ']' && myStack.isEmpty()) {
                    return 0;
                }else{
                    myStack.pop();
                }

            }

            
            
            
        }
        
        
        
    }
    
    
    
    
    
    
    
    
}
