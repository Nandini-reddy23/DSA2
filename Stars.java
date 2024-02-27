import java.util.*;
public class Stars {
    public static void main(String args[])
    {//PATTERN-1
        int n=5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
//PATTERN-2
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
    }
    for(int k=1;k<=(2*i)-1;k++){
        System.out.print("*");
    }
    System.out.println();
}
//PATTERN-3
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
//PATTERN-4
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
    }
    for(int k=1;k<=(2*i)-1;k++){
        System.out.print("*");
        System.out.print(" ");
    }
    System.out.println();
}
//PATTERN-5
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    
    for(int k=1;k<=2*(n-i);k++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }

    System.out.println();
}
for(int i=n-1;i>=1;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    
    for(int k=1;k<=2*(n-i);k++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }

    System.out.println();
}
//PATTERN-6
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("*");
    }
    System.out.println();
}
//PATTERN-7
for(int i=n;i>=1;i--){
    for(int k=1;k<=(n-i);k++){
        System.out.print(" ");
    }
    for(int j=1;j<=(2*i)-1;j++){
System.out.print("*");
    }
    System.out.println();
}

for(int i=1;i<=n;i++){
    for(int k=1;k<=(n-i);k++){
        System.out.print(" ");
    }
    for(int j=1;j<=(2*i)-1;j++){
System.out.print("*");
    }
    System.out.println();
}
//PATTERN-8
for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        for(int l=1;l<=2*(n-i);l++){
            System.out.print(" ");

        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
}
//PATTERN-9
for(int i=1;i<=2*n;i++){
    if(i%2==0){
        for(int j=1;j<=i;j++){
            System.out.print("*");   
        }
    }
else{
    for(int j=1;j<=i+1;j++){
        System.out.print("*");   
    }
}
    System.out.println();

    }
    
    }
}    

