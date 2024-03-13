import java.util.*;
public class PrefixSum {
    public static void main(String []args){
        int[] a={6,3,0,2,3,7,1,5};
        int q=4;
        Scanner s=new Scanner(System.in);
        int[] prefixsum=new int[a.length];
        prefixsum[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefixsum[i]=prefixsum[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(prefixsum[i]+" ");
        }
        for(int j=0;j<q;j++){
            System.out.println("Enter l and r: ");
            int l=s.nextInt();
            int r=s.nextInt();
            if(l==0){
                System.out.println(prefixsum[r]);
            }
            else{
                System.out.println(prefixsum[r]-prefixsum[l-1]);
            }
        }
    }
}
