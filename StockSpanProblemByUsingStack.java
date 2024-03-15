import java.util.Stack;

public class StockSpanProblemByUsingStack {
    public static void main(String [] args){
        int[] price ={100,80,60,70,60,75,85};
        int n=7;
         int[] arr=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && price[i]>=price[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=i+1;
            }
            else {
                arr[i]=i-st.peek();
            }
            st.push(i);
         }
         for(int i=0;i<n;i++){
            System.out.print(price[i]+" ");
         }
         System.out.println();
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         }
    
   }
    }

