public class PermutationsOnString {
    public static void permutations(String s,String per){
        if(s.length()==0){
            System.out.println(per+" ");
            return;
        }
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            permutations(s.substring(0,j)+s.substring(j+1),per+c);
        }
    }
    public static void main(String[] args) {
        permutations("abc","");
        permutations("abcd","");
    }
}
