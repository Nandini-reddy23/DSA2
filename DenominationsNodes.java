import java.util.*;
public class DenominationsNodes {
    public static void nodesMatching(int[] a,int amt){
        for(int i=a.length-1;i>=0;i--){
            if(a[i]<=amt){
                while(a[i]<=amt){
                    System.out.println(a[i]);
                    amt-=a[i];
                }
            }
        }
    }
    public static void main(String[] args){
        int[] a={5,2,10,2000,1,500,100,50,200,20};
        int amount=43;
        Arrays.sort(a);
        nodesMatching(a,amount);
        
    }
}
