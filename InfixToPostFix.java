import java.util.*;
public class InfixToPostFix {
    public static  int prec(char c){
        if(c=='+' || c=='-')
            return 1;
        
        else if(c=='*' || c=='/') return 2;
        else if(c=='^') return 3;
        return -1;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String postfix="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char  c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                postfix+=c;
            }
            else if(c=='(') st.push('(');
            else if(c==')') {
                while(!st.isEmpty() && st.peek()!='('){
                    postfix+=st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && prec(c)<=prec(st.peek())){
                    postfix+=st.peek();
                    st.pop();
                }
            
            st.push(c);}
        }
        while(!st.isEmpty()){
postfix+=st.peek();
            st.pop();
        }
        
        System.out.println("postfix="+postfix);
    }
}
