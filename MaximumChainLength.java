import java.util.*;
public class MaximumChainLength {
    public static void main(String [] args){
        int[][] pairs={{1,2},{7,8},{4,5}};
        for(int i=0;i<pairs.length;i++){
            for(int j=0;j<pairs[i].length;j++){
            System.out.print(pairs[i][j]);
            }    
            System.out.println();
        }
        System.out.println("______________");
        
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[0]));
        int chain=0;
        int last=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(last<pairs[i][0]){
                chain++;
                last=pairs[i][1];
            }

        }
        System.out.println("chain length="+chain);
    }
}
