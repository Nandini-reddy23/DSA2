import java.util.*;
public class ComparatorUsing {
    public static void printMatrix(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
    public static void main(String []args){
        int[][] a={{10,35},{7,39},{6,60},{1,12}};
        printMatrix(a);
        Arrays.sort(a,Comparator.comparingDouble(o->o[1]));
        printMatrix(a);

    }
}
