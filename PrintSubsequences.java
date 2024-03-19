public class PrintSubsequences {
    public static void printSubsequences(String s,int i,String newstr){
        if(i==s.length()){
            System.out.println(newstr+" ");
            return;
        }
        printSubsequences(s,i+1,newstr+s.charAt(i));
        printSubsequences(s,i+1,newstr);
    }
    public static void main(String []args){
        printSubsequences("abc",0,"");
        printSubsequences("abcd", 0, "");
    }
}
