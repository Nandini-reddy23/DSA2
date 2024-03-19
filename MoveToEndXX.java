public class MoveToEndXX{
    public static void movetoend(String s,String newstr,int i,int count){
        if(i==s.length()){
            for(int j=0;j<count;j++){
                newstr+='x';}
            System.out.println(newstr);
            return;
        }
        if(s.charAt(i)!='x')
        movetoend(s,newstr+s.charAt(i),i+1,count);
        else movetoend(s,newstr,i+1,count+1);
    }
    public static void main(String[] args) {
        movetoend("axbxcxxdxefx","",0,0);
    }
}