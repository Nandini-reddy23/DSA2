import java.util.*;
public class HashMapToFindMajorityElement {
    public static void main(String args[]){
        int[] a={1,2,3,2,1,2,1,3,2};
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(1,6);
        map.put(2,2);
        map.put(3,2);
        System.out.println(map.get(2));//2
        System.out.println(map.get(4));//null
        System.out.println(map.getOrDefault(4,0));//0
        System.out.println(map);//{1=6, 2=2, 3=2}

    }
    
}
