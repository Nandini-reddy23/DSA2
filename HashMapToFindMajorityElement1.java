import java.util.*;
public class HashMapToFindMajorityElement1 {
    public static void main(String[] args){
        int[] a={1,2,3,2,1,2,1,3,2};
       int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int j:map.keySet())
        {
            System.out.println(j+" " +map.get(j));
        }
        for(int i:map.keySet())
        {
            if(map.get(i)>=(n/2)){
                System.out.println(i+" is the majority element");
            }    
        }
    }
    
}
