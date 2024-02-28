import java.util.*;
public class AnagramUsingHashing {
    public static boolean isAnagram(String s,String t){
        int a[] =new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++){
            a[t.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 stings to check anagram or not");
        String  s=sc.next();
        String t=sc.next();
        if(isAnagram(s,t))
        {
            System.out.println(s+ " "+t+ " are Anagrams");
        }
        else{
            System.out.println(s+ " "+t+ " are not Anagrams");
        }
    }
    
}
