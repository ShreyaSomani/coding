def pattern(n):
    lstar=int(n/2)+1
    lspace=0
    rstar=1
    rspace=n-(lstar+lspace+rstar)
    t=rspace
    
    for i in range(n):
        print(lspace*"\t",end="")
        print(lstar*"*\t",end="")
        print(rspace*"\t",end="")
        print(rstar*"*\t")
           
        if i<int(n/2)-1:
            lspace=int(n/2)
            lstar=1
            
        elif i==int(n/2)-1:
            lstar=n
            rstar=0
            lspace=0
            rspace=0
            
        elif i==n-2:
            lstar=1
            lspace=0
            rspace=t
            rstar=int(n/2)+1
            
        else:
            lstar=1
            rstar=1
            lspace=0
            rspace=t
            
n=int(input())
pattern(n)
            
        
            
        
            