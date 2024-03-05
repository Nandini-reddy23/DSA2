import java.util.*;
public class FractionalKnapSack {
    public static void maximumProfit(int[] p,int[] w,int c){
        int[][] a=new int[p.length][w.length];
        for(int i=0;i<a.length;i++){
            a[i][0]=w[i];
            a[i][1]=p[i];
            a[i][2]=p[i]/w[i];
        }
        Arrays.sort(a,Comparator.comparingDouble(o->o[2]));
        int profit=0;
        for(int i=a.length-1;i>=0;i--){
            if(c>=a[i][0]){
                profit+=a[i][1];
                c-=a[i][0];
            }
            else{
                profit+=c*a[i][2];
            }
        }
        System.out.println(profit);
    }
    public static void main(String args[]){
        int[] p={60,100,120};
        int[] w={10,20,30};
        int c=50;
        maximumProfit(p,w,c);
    }
}
