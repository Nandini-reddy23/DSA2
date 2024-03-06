import java.util.*;
public class MinimumAbsoluteDifferenceSum {
    
 public static void main(String []args){
    int[] A={8,7,2,4,3,9};
    int[] B={6,3,0,2,3,7};
Arrays.sort(A);
Arrays.sort(B);
int sum=0;
for(int i=0;i<A.length;i++){
    sum+=Math.abs(A[i]-B[i]);
}
System.out.println("Sum="+sum);
 }   
}
