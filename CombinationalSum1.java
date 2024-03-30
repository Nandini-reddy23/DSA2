import java.util.ArrayList;
import java.lang.*;
public class CombinationalSum1 {
    public static void findCombinations(int i,int[] a,int target,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> al){
        if(i==a.length){
            if(target==0){
                ans.add(new ArrayList<>(al));
            }
            return;
        }
        if(a[i]<=target){
            al.add(a[i]);
            findCombinations(i, a, target-a[i],ans, al);
            al.remove(al.size()-1);
        }
        findCombinations(i+1, a, target, ans, al);
    }
    public static void main(String [] args){
        int[] a={2,3,6,7};
        int target=7;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        findCombinations(0,a,target,ans,new ArrayList<>());
        System.out.println(ans);
    }
}
