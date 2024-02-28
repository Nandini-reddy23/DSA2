import java.util.*;
public class AnagramSolution1 {
    public static boolean isAnagram(String s,String t){
        HashMap<Character ,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }
        for(char i:map.keySet()){
            if(map.get(i)!=0){
                return false;
            }
            
            }
            return true;
        }
    
    public static void main(String args[]){
        
        String s="silent";
        String t="listen";
       if( isAnagram(s,t)){
       System.out.println(s+ " "+t+ " are Anagrams");
       }
       else{
        System.out.println(s+ " "+t+ " are not Anagrams");
       }
    }
}
