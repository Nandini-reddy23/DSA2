import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;

public class CombinationalSum2 {
    public static void findCombinations(int i,int[] a,int target,List<List<Integer>> ans,List<Integer> al){
        if(target==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int j=i;j<a.length;j++){
            if(j>i && a[j]==a[j-1]) continue;
            if(a[j]>target) break;
            al.add(a[j]);
            findCombinations(j+1, a, target-a[j],ans, al);
            al.remove(al.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] a={1,1,1,2,2};
        int target=4;
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(a);
        findCombinations(0, a, target, ans,new ArrayList<>());
        System.out.println(ans);
    }
}
