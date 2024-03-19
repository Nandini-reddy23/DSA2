public class RemoveDuplicatesFromString {
public static void  removeDuplicates(String s,String newstr,int i){
    if(i==1) newstr+=s.charAt(0);
        if(i==s.length()){
            System.out.println(newstr);
            return;
        }
        if(s.charAt(i)==s.charAt(i-1)){
            removeDuplicates(s,newstr,i+1);
        }
        else{
            removeDuplicates(s,newstr+s.charAt(i),i+1);
        }
    }
    public static void main(String[] args) {
        removeDuplicates("abbdeefhgg", "", 0);
    }
}
