public class EquilibriumPointOptimal {
    public static void main(String []args){
    int[] a={5,5,2,5,8};
        
       // Scanner s=new Scanner(System.in);
        int[] prefixsum=new int[a.length];
        prefixsum[0]=a[0];
        int count=0;
        for(int i=1;i<a.length;i++){
            prefixsum[i]=prefixsum[i-1]+a[i];
            
        }
        for(int i=0;i<a.length;i++){
            System.out.print(prefixsum[i]+" ");
        } if(a.length==1){
            System.out.println("count="+1);
        }
        
        if(a.length==2){
            System.out.println("count="+0);
        }
       if(a.length>2){
        for(int k=1;k<a.length;k++){

            int leftsum=prefixsum[k]-a[k];
            int rightsum=prefixsum[a.length-1]-a[k];
            if(leftsum==rightsum){
count++;
            }
        }

    }
    System.out.println("Count="+count);
}
}