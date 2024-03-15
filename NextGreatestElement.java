import java.util.ArrayList;
class NextGreatestElement {
    static class StacksUsingArraylist{
        ArrayList<Integer> al=new ArrayList<>();
        public boolean isEmpty(){
            if(al.size()==0) return true;
            else return false;
        }
        public void push(int d){
            al.add(d);
        }
        public int pop(){
            if(isEmpty()) {
            return -1;
            }
            return al.remove(al.size()-1);
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return al.get(al.size()-1);
        }
        }
    
    public static void main(String[] args){
        int[] a={6,0,8,9,2,3};
        int[] next=new int[a.length];
        StacksUsingArraylist stack=new StacksUsingArraylist();
        for(int i=a.length-1;i>=0;i--){
            while(!stack.isEmpty() && a[i]>stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i]=-1;
            }
            else{
                next[i]=stack.peek();
            }
            stack.push(a[i]);
        }
     for(int i=0;i<a.length;i++){
        System.out.print(next[i]+" ");
     }   
    }
}
