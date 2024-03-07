import java.util.*;
public class JobSequencingMaximumProfit{
    public static void jobSequencing(int[] d,int[] p){
        int[][] a=new int[d.length][2];
        int days=0;
        for(int i=0;i<a.length;i++){
            a[i][0]=d[i];
            a[i][1]=p[i];
            days=Math.max(days,d[i]);
        }
        int[] arr=new int[days];
        Arrays.sort(a,Comparator.comparingDouble(o->o[1]));
        int profit=0;
        for(int i=a.length-1;i>=0;i--){
            int ind=a[i][0]-1;
            while(ind>=0 && arr[ind]==-1){
                ind--;
            }
            if(ind>=0 && arr[ind]==0){
                arr[ind]=-1;
                profit+=a[i][1];
            }
        }
        System.out.println(profit);
    }
    public static void main(String [] args){
        int[] deadline={2,1,2,1,1};
        int[] profits={100,19,27,25,15};
        jobSequencing(deadline, profits);
    }
}