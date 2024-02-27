public class MaxSubArray {
    public static void main(String args[]){
        int [] a={-2,-3,4,-1,-2,1,5,-3};
        int sum=0 ,max=0;
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=i;j<a.length;j++){
            sum=sum+a[j];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
            }
            
        }
    }
    System.out.println(max);
    }
    
}
