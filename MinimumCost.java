import java.util.*;
public class MinimumCost {
    public static void reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static int minimumCost(int[] V,int[] H,int M,int N){
        Arrays.sort(V);
        Arrays.sort(H);
        reverse(V);
        reverse(H);
        int vc=1;
        int hc=1;
        int i=0;
        int j=0;
        int cost=0;
        while(i<M && j<N){
            if(V[i]>H[j]){
                cost+=V[i]*hc;
                vc++;
                i++;
            }
            else{
                cost+=H[j]*vc;
                hc++;
                j++;
            }
        }
        while(i<M){
            cost+=V[i]*hc;
            vc++;
            i++;
        }
        while(j<N){
            cost+=H[j]*vc;
            hc++;
            j++;
        }
        return cost;
    }
    public static void main(String []args){
        int[] V={2,1,3,1,4};
        int[] H={4,1,2};
        int M=V.length;
        int N=H.length;
        int cost=minimumCost(V,H,M,N);
    System.out.println("Minimum cost="+cost);
}
}
