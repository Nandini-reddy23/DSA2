var i=1;
n=9
        var c=0;
        while(i<=n){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            console.log(+n+" is a prime number");
        }
        else{
            console.log(+n+" is not  a prime number");   
        }
    