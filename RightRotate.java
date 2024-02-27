import java.util.*;
public class RightRotate1 {
    public static void reverse(int[] a ,int low,int high){
        int left=low;
        int right=high;
        while(left<=right){
           int  temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
        public static void printArray(int[] var0) {
        for(int var1 = 0; var1 < var0.length; ++var1) {
           System.out.print(var0[var1] + " ");
        }
  
     }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int a[] =new int[n];
        System.out.println("Enter values:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter no of rotations:");
        int no=sc.nextInt();
    
        printArray(a);
        rotate(a,no);
        System.out.println();
        printArray(a);        

    }
    
}
