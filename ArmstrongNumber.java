public class ArmstrongNumber {
    public static void main(String args[]){
        int n=153;
        int tem=n;
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        int num=tem;
        int ld,sum=0;
        while(num>0){
            ld=num%10;
            sum+=Math.pow(ld,count);
            num=num/10;
        }
        System.out.println(tem==sum);
    }
    
}
