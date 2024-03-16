import java.util.Stack;

public class LargestAreaRectangleOfHistogram {
    public static void main(String [] args){
        int[] a={2,1,5,6,2,3};        Stack<Integer> st=new Stack<>();
        int[] NSR=new int[a.length];
        int[] NSL=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && a[i]<=a[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) NSR[i]=a.length;
            else NSR[i]=st.peek();
            st.push(i);
        }
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[i]<=a[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) NSL[i]=-1;
            else NSL[i]=st.peek();
            st.push(i);
        }
        int maxarea=0;
        for(int i=0;i<a.length;i++){
            int area=a[i]*(NSR[i]-NSL[i]-1);
            maxarea=Math.max(area,maxarea);
        }
        System.out.println("MaxArea="+ maxarea);
  
    }
}
