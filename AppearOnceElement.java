import java.util.*;
public class AppearOnceElement {
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int xor=0;
        for(int j=0;j<n;j++)
        {
            xor=xor^a[j];
        }
        System.out.println(xor+" is appeared once");
    }
    
}
