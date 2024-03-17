import java.util.*;
public class InfixToPrefix {
    public static int prec(char c){
        if(c=='+' || c=='-') return 1;
        else if(c=='*' || c=='/') return 2;
        else if(c=='^') return 3;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a infix string:");
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        String prefix="";
        String str="";
        for(int i=s.length()-1;i>=0 ;i--){
            str+=s.charAt(i);
        }
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c)){
                prefix+=c;
            }
            else if(c==')') st.push(c);
            else if(c=='('){
                while(!st.isEmpty() && st.peek()!=')'){
                    prefix+=st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && prec(c)<=prec(st.peek())){
                    prefix+=st.peek();
                    st.pop();
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()) {
            prefix+=st.peek();
            st.pop();
        }
        System.out.println("Prefix"+prefix);
        String newprefix="";
        for(int i=prefix.length()-1;i>=0 ;i--){
            newprefix+=prefix.charAt(i);
        }
        
        System.out.println("prefix=" +newprefix);
    }
}
