public class NumbersPattern {
    public static void main(String args[]){
        int n=5;
        System.out.println("PATTERN-1:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(((i+j)&1)==0)
                {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println("PATTERN-2:");
        int k=1;
        for(int i=1;i<n;i++){
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(+k );
                k++;
            }
            System.out.println();
        }
        System.out.println("PATTERN-3:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            for(int l=1;l<=2*(n-i);l++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("PATTERN-3:\n");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int m=1;m<=n-i;m++){
                System.out.print(" ");
            }
            int o=i;
            for(int j=1;j<=i;j++){
                
                System.out.print(o);
                o--;
            }
            System.out.println();
        }

    }
    
}
