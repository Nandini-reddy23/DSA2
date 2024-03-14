public class SpecialIndex {
public static void main(String []args){
    int[] a={5,5,2,5,8};
    int[] prefix=new int[a.length];
    prefix[a.length-1]=a[a.length-1];
    prefix[a.length-2]=a[a.length-2];
    for(int i=a.length-3;i>=0;i--){
        prefix[i]=prefix[i+2]+a[i];
    }
    for(int i=0;i<a.length;i++){
        System.out.print(prefix[i]+" ");
    }
    int LES=0,LOS=0;
    int specialIndex=0;
    for(int i=0;i<a.length;i++){
        if(i%2==0){
            if(i<=a.length-3){
                if(LES+prefix[i+1]==LOS+prefix[i+2]){
                    specialIndex++;
                }
            }
            else if(i==a.length-2){
                if(LES+prefix[i+1]==LOS) specialIndex++;
            }
            else{
                if(LES==LOS) specialIndex++;
            }
            LES+=a[i];
        }
        else{
            if(i<=a.length-3){
                if(LES+prefix[i+2]==LOS+prefix[i+1]){
                    specialIndex++;
                }
            }
            else if(i==a.length-2){
                if(LES==LOS+prefix[i+1])
                specialIndex++;
            }
            else {
                if(LES==LOS) specialIndex++;
            }
            LOS+=a[i];
        }
    }
    System.out.println("count="+specialIndex);
}
}
