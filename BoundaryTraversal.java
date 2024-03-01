import java.util.*;
public class BoundaryTraversal{
    public static void main(String [] args)
    {
        int[][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        if(a.length==1){
            for(int i=0;i<a[0].length;i++)
            System.out.print(a[0][i]+" ");
        }
        else if(a[0].length==1){
            for(int i=0;i<a.length;i++)
            System.out.print(a[i][0]+" ");
        }
        else{
            for(int i=0;i<a[0].length;i++){
                System.out.print(a[0][i]+" ");
            }
            for(int i=1;i<a.length;i++){
                System.out.print(a[i][a[0].length-1]+" ");
            }
            for(int i=a[0].length-2;i>=0;i--){
                System.out.print(a[a.length-1][i]+" ");
            }
            for(int i=a.length-2;i>=1;i--){
                System.out.print(a[i][0]+" ");
            }
        }

        }
    }
