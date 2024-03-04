import java.util.*;
public class BetterTwoSum {
    public static void main(String [] args){
        int[] a={2,5,1,4,6};
        int target=9;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],i);
        }
        for(int i=0;i<a.length;i++){
            int rem=target-a[i];
            if(map.containsKey(rem))
            {
                System.out.println(map.get(rem));
            }
        }
    }
   
}

