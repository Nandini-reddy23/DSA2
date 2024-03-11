import java.util.*;
import java.lang.*;
import java.io.*;

class SnakesAndMongooses
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
		    String t=s.next();
		    int ani=t.length();
		    int mong=0;
		    for(int j=0;j<t.length();j++)
		    { if(t.charAt(j)=='m')
		    {  
		        mong++;
		        int k=j-1;
		        int l=j+1;
		        if((k)>=0 && t.charAt(k)=='s'){
		            ani--;
		        }
		        else if((l)<t.length() && t.charAt(l)=='s'){
		            ani--;
		        }
		    }
		    }
		    int snakes=ani-mong;
		    if(mong>snakes){
		        System.out.println("mongooses");
		    }
		    else if(mong<snakes){
		        System.out.println("snakes");
		    }
		    else
		    System.out.println("tie");
		}// your code goes here

	}
}
