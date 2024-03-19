public class FirstLastOccurrence {
    public static void firstlastOccurence(String s,int i,char target,int first,int last){
        if(i==s.length()){
            System.out.println(first+" "+last);
            return;
        }
        if(s.charAt(i)==target){
            if(first==-1)
            first=i;
            last=i;
        }
        firstlastOccurence(s,i+1,target,first,last);
    }
    public static void main(String [] args) {
        firstlastOccurence("Nandini",0,'n',-1,-1);
    }
}
