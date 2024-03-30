import java.util.*;
import java.lang.*;
class SubsetsWithDuplicates{
    public static void recursion(int i,int[] a,List<Integer>al,List<List<Integer>>ans){
        ans.add(new ArrayList<>(al));
        for(int j=i;j<a.length;j++){
            if(j!=i && a[j]==a[j-1]) continue;
            al.add(a[j]);
            recursion(j+1,a,al,ans);
            al.remove(al.size()-1);
        }
        
    }
    public static void subsetsWithDuplicates(int [] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans=new  ArrayList<>();
        List<Integer> al=new ArrayList<>();
        recursion(0,nums,al,ans);
        System.out.println(ans);

    }
    public static void main(String args[]){
        int[] a={1,2,3};
        subsetsWithDuplicates(a);

    }
}