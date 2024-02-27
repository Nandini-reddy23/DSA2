import java.util.Scanner;
public class Reversearray2{
    public static void reverse(int[] a){
        int left=0;
        int right=a.length-1;
        while(left<=right){
           int  temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        printArray(a);
        reverse(a);
        System.out.println();
        printArray(a);
    }
}