import java.util.*;
public class RemoveDuplicatesFromSortedArray{
    public  static void main(String []args){
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            }
        int left=0;
        int right=1;
        while(right<n){
            if(a[left]!=a[right]){
                left++;
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
            }
            right++;
        }
        System.out.println("Elements After sorting:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(+(left+1)+" elements are unique");
    }
}