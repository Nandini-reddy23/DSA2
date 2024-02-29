public class MatricesPrint {
    public static void printMatrix(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        diagonalSum1(a);
        diagonalSum2(a);
    }
    public static void diagonalSum1(int[][] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j){
                    sum=sum+a[i][j]+a[i][a.length-1-i];
                }
            }
        }
        if(a.length%2==1){
            sum-=a[a.length/2][a.length/2];
        }
        System.out.println("sum="+sum);
    }
    public static void diagonalSum2(int[][] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i][i]+a[i][a.length-i-1];
        }
        if(a.length%2==1){
            sum-=a[a.length/2][a.length/2];
        }
        System.out.println("sum="+sum);
    }
    public static void snakePattern(int[][] a){
        for(int i=0;i<a.length;i++){
            if((i&1)==1){
                for(int j=a[i].length-1;j>=0;j--){
                    System.out.print(a[i][j]+" ");
                }
            System.out.println();
            }
            else{
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void rotateClockWise(int[][] a){
        transposeMatrix(a);
        for(int i=0;i<a.length;i++){
        int start=0;
        int end=a[i].length-1;
        while(start<end){
            int temp=a[i][start];
            a[i][start]=a[i][end];
            a[i][end]=temp;
            start++;
            end--;
        }
    }
}
public static void transposeMatrix(int[][] a){
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a[i].length;j++)//j=0;j<i
        {
            int temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;
        }
    }
}
    public static void main(String [] args){
        int[][] a={ {1,2,3,4,1},{5,6,7,8,2},{9,10,11,12,3},{13,14,15,16,4},{17,18,19,20,5}};
        printMatrix(a);
        System.out.println("pattern Rotateclockwise:");
        rotateClockWise(a);
        printMatrix(a);
        System.out.println("Snake Pattern");
        snakePattern(a);
        
    }

    
}
