import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefix {
      public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<String> st=new Stack<>();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c>='a' && c<='z' || c>='A' && c<='Z'){
            st.push(c+"");
        }
        else {
            String top1=st.pop();
            String top2=st.pop();
            st.push(c+top2+top1);
        }

       }
      System.out.println("Prefix="+st.pop());
}//abc++
//Prefix=+a+bc
}