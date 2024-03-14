import java.util.*;
import java.lang.*;
import java.io.*;

class SnakesAndMongoosesUsingStringBuilder
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
		    String t=s.next();
		    StringBuilder str=new StringBuilder(t);
		    for(int j=0;j<str.length()-1;j++){
		        if(str.charAt(j)=='s' && str.charAt(j+1)=='m'){
		            str.replace(j,j+2,"m");
		        }
		        else if(str.charAt(j)=='m' && str.charAt(j+1)=='s'){
		            str.replace(j,j+2,"m");
		        }
		    }
		    int sn=0;
		    int mon=0;
		    for(int k=0;k<str.length();k++){
		        if(str.charAt(k)=='s') sn++;
		        else mon++;
		    }
		    if(sn>mon){
		        System.out.println("snakes");
		    }
		    else if(mon>sn){
		        System.out.println("mongooses");
		    }
		    else {
		        System.out.println("tie");
		    }
		  
		}}
}
