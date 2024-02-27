public class Sortarray1 {
    public static void sortarray(int[] a){
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
            zero++;
            else if(a[i]==1)
            one++;
            else 
            two++;
        }
        int k=0;
        while(zero!=0){
            a[k++]=0;
            zero--;
        }
        while(one!=0)
        {
            a[k++]=1;
            one--;
        }
        while(two!=0){
            a[k++]=2;
            two--;
        }
        for(int i=0;i<a.length;i++)
        {
        System.out.print(" "+a[i]);
        }

    }
        public static void main(String args[]){
            int[] a={0,1,1,2,0,1,2,0,1};
            sortarray(a);

        }   
}
