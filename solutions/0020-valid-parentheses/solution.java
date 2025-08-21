import java.util.Stack;
class Solution {
    public static void main(String []agrs){
        String s ="{[()]}";
        boolean a=isValid(s);
        System.out.println(a);
    }
    public static boolean isValid(String s) {
        
        Stack<Character> s1 =new Stack<>();
        char[] ch=s.toCharArray();
    
        for(Character sr:ch){
            if(sr=='{'){
                s1.push('}');
            }
            else if(sr=='['){
                s1.push(']');
            }
            else if(sr=='('){
                s1.push(')');

            }
            else if(s1.isEmpty()||s1.pop()!=sr){
                return false;
            }

            

        }
        return s1.isEmpty();
        

    }
}
