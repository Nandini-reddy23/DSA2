public class RecursionBasicPrograms {
   public static void  print1to5(int i, int n){
        if(i>n) return;
        System.out.print(i+" ");
        print1to5(i+1,n);
    }
    public static void print5to1(int n){
        if(n<1) return;
        System.out.print(n+" ");
    print5to1(n-1);
    }
    public static void printsum(int i,int n ,int sum){
        if(i>n) {
            System.out.println(sum);
            return;
        }
        printsum(i+1,n,sum+i);
        
    }
    public static void fact(int n,int f){
        // if(n==0){
        //     System.out.println(f);
        //     return;
        // }
        if(n<1){
            System.out.println(f);
            return;
        }
        fact(n-1,f*n);
    }

    public static int  sumofFirst10(int n){
        if(n==0) {
            return 0;
        }
        return sumofFirst10(n-1)+n;
    }
    public static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
        
    }
    public static void main(String[]args){
       // print1to5(1,5);
       //print5to1(5);
       //printsum(1,5,0);
       //fact(5,1);
     // System.out.println( sumofFirst10(10));
        System.out.println(fibonacci(6));
    }
}
