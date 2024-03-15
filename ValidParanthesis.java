import java.util.Stack;
import java.util.*;

public class ValidParanthesis {
 public  static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
            st.push(s.charAt(i));
        }
        else{
            if(st.isEmpty()) return false;
            char top=st.peek();
            if(s.charAt(i)==')'){
                if(top!='(') return false;
            }
            if(s.charAt(i)==']'){
                if(top!='[') return false;
            }
            if(s.charAt(i)=='}'){
                if(top!='{') return false;
            }
        }
}        if(!st.isEmpty()) return true;
        else return false;
       }
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        System.out.println(isValid(str));

       } 
    }
   

