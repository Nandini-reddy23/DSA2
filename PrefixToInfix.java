import java.util.*;
public class PrefixToInfix {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<String> st=new Stack<>();
       for(int i=s.length()-1;i>=0;i--){
        char c=s.charAt(i);
        if(c>='a' && c<='z' || c>='A' && c<='Z'){
            st.push(c+"");
        }
        else {
            String top1=st.pop();
            String top2=st.pop();
            st.push("("+top1+c+top2+")");
        }

       }
       System.out.println("Infix="+st.pop());
    }
}


