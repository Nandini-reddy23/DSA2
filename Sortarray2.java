public class Sortarray2 {
    public static void sortbymid(int[] a){
        int low=0;
        int mid=0;
        int high=a.length-1;
        while(mid<=high)
        {
        if(a[mid]==0){
            int temp=a[low];
            a[low]=a[mid];
            a[mid]=temp;
            low++;
            mid++;
        }
        else if (a[mid]==1){
            mid++;
        }
        else{
            int temp=a[mid];
            a[mid]=a[high];
            a[high]=temp;
            high--;
        }
    }
    }

    
    
    
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int[] b={0,1,1,2,0,1,2,0,1};
        printArray(b);
        System.out.println();
        sortbymid(b);
        printArray(b);
    }
    
}
