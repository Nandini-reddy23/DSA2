import java.util.*;
public class BruteTwoSum{
    public static void twoSum(int[] a,int target){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;i<a.length;i++){
                if(a[i]+a[j]==target){
                    System.out.println(i+" ,"+j);
                }
            }
        }
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int[] a={2,6,5,8,11};
        int target=14;
        twoSum(a,target);
    }
}