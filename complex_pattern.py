def pattern(n):
    outer=int(n/2)
    inner=-1
    lstar=1
    rstar=0
    
    for i in range(n):
        print(outer*"\t",end="")
        print(lstar*"*\t",end="")
        print(inner*"\t",end="")
        print(rstar*"*\t")
        
        if i<int(n/2):
            outer=outer-1
            inner=inner+2
            rstar=1
            
        elif i==n-2:
            rstar=0
            inner=0
            if n%2!=0:
                outer=outer+1
            else:
                outer=outer+2
            
            
        else:
            outer=outer+1
            inner=inner-2
            rstar=1
            
            
            
        
n= int(input())
pattern(n)