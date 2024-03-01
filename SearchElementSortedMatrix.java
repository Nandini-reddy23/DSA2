import java.util.*;
public class SearchElementSortedMatrix {
    public static void main(String args[]){
        int[][] a={{10,20,30,40,50},{12,22,32,42,52},{14,24,34,44,54},{16,26,36,46,56},{18,28,38,48,58}};
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the target:");
        int target=s.nextInt();
        int i=0;
        int j=a[0].length-1;
        while(i<a[0].length && j>=0){
            if(a[i][j]==target){
                System.out.println("Element is found");
                break;
            }
            else if(a[i][j]>target){
                j--;
            }
            else {
                i++;
            }
            
        }
        
    }
    
}
