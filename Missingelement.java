import java.util.*;
public class Missingelement {
    
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
        //by using hashing
        int sum1=0;
        int sum2=0;
        for(int k=1;k<=n+1;k++){
            sum2+=k;
        }
        
        for(int j=0;j<n;j++)
        {
            sum1=sum1+a[j];
        }
        System.out.println(sum1);
        System.out.println(sum2);
System.out.println(sum2-sum1 +" is the missing element");
        }
    
}
