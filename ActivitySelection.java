import java.util.*;
public class ActivitySelection {
    public static int activitySelection(int[] start,int[] end){
        int[][] a=new int[start.length][2];
        for(int i=0;i<a.length;i++){
            a[i][0]=start[i];
            a[i][1]=end[i];
        }
        Arrays.sort(a,Comparator.comparingDouble(o->o[0]));
        int maxAct=1;
        int lastAct=a[0][1];
        for(int i=0;i<a.length;i++){
         if(lastAct<a[i][0]){
            maxAct++;
            lastAct=a[i][1];
         }
        }
        return maxAct;
    }
    public static void main(String []args){
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int max=activitySelection(start,end);
        System.out.println("Maximum no of activites:"+max);
    }
}
