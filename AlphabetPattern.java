public class AlphabetPattern {
    public static void main(String args[]){
        int n=5;
        System.out.println("PATTERN-1");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("PATTERN-2:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
        
    }
    
}
