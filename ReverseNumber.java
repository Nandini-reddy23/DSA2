public class ReverseNumber {
    public static void main(String args[]){
        int n=123;
        int rev=0,tem=n,ld;
        while(n>0){
            ld=n%10;
            rev=rev*10 + ld;
            n/=10;
        }
        System.out.println("Reverse of a number "+ n+ "is "+rev);
    }
    
}
