import java.util.*;
public class BoyerMooveVotingAlgorithm {
    //boyer moove voting algorithm
    public static void main(String[] args){
        int[] a={1,2,3,1,2,1,1,3,1,1};
        int votes=0;
        int maj=-1;
        for(int i=0;i<a.length;i++){
            if(votes==0){
                maj=a[i];
            }
            else if(a[i]==maj){
                votes++;
            }
        else{ votes--;
        }
        }
        System.out.println(maj+ " is the majority element");
    }
}
