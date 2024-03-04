import java.util.*;
public class BuyAndSellStock {
    public static void maxProfit(int[] a){
        int min=a[0];
        int profit=0;
        for(int i=0;i<a.length;i++){
            min=Math.min(min, a[i]);
            profit=Math.max(profit, a[i]-min);
        }
        System.out.println(profit);
    }
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of prices:");
        int n=sc.nextInt();
        System.out.println("Enter prices:");
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        maxProfit(a);
    }
}
