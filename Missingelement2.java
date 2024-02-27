import java.util.*;
public class Missingelement2 {
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] a =new int[n];
        int[] b =new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int xor=1;
       for(int j=0;j<n;j++){
        xor=xor^a[j]^j;
       }
System.out.println( xor+" is the missing element");
        }
    
}
