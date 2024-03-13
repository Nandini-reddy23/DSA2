import java.util.*;
public class EvenAndOddSumBeforeElement {
    public static void main(String [] args){
        int[] a={1,2,3,4,5,6};
        Scanner s=new Scanner(System.in);
    int[] prefixsum=new int[a.length];
    prefixsum[0]=a[0];
    prefixsum[1]=a[1];
    
    for(int i=2;i<a.length;i++){
        prefixsum[i]=prefixsum[i-2]+a[i];
        
    }
    for(int i=0;i<a.length;i++){
        System.out.print(prefixsum[i]+" ");
    }
    System.out.println("Enter index:");
    int r=s.nextInt();
    if(r%2==0){
        System.out.println("ES="+prefixsum[r]+" and OS="+prefixsum[r-1]);
    }
    else{
        System.out.println("ES="+prefixsum[r-1]+" and OS="+prefixsum[r]);
    }
    
    
}
}