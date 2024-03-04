import java.util.*;
public class CheckPangram {
    public static boolean isPangram(String s){
        if(s.length()<26){
            return false;
        }
        else{
            for(char ch='a';ch<='z';ch++){
                if(s.indexOf(ch)<0){
                    return false;
                }
            }
        }
         return true;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");//the quick brown fox jumps over a lazy dog
        String s=sc.nextLine();
        if(isPangram(s.toLowerCase())){
            System.out.println("It is a pangram");
                }
        else {
            System.out.println("It is not a pangram");
                }
    }
}
