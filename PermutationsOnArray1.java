import java.util.ArrayList;

public class PermutationsOnArray1 {
    public static void permutations(int[] a, boolean[] b ,ArrayList<Integer> al){
        if(al.size()==a.length){
            System.out.println(al);
            return;
        }
        for(int i=0;i<a.length;i++){
            if(b[i]==false){
                b[i]=true;
                al.add(a[i]);
                permutations(a, b, al);
                al.remove(al.size()-1);
                b[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        boolean[] b=new boolean[a.length];
        ArrayList<Integer> al=new ArrayList<>();
    permutations(a, b, al);    }
}
