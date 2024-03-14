import java.util.*;
public class Stacks {
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
        public int size(){
            return al.size();
        }
    }
    public static void main(String[] args){
        StacksUsingArraylist stack=new StacksUsingArraylist();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println(stack.isEmpty());
       
    }
}
