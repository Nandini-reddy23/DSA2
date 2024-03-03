import java.util.*;
public class FunctiosInArrayList {
    public static void main(String [] args){
        ArrayList<Integer> a1= new ArrayList<>();
        a1.add(5);
        a1.add(3);
        a1.add(2,3);
        a1.add(6);
        a1.add(8);
        a1.remove(4);
        Collections.sort(a1);
        System.out.println(a1);
        Collections.sort(a1,Collections.reverseOrder());
        System.out.println(a1.isEmpty());
        System.out.println(a1);
        System.out.println(a1.indexOf(3));

    }
}
