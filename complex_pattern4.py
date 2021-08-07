def pattern(n):
    lstar=n
    outer=0
    lspace=0
    rspace=0
    
    print(lstar*"*\t")
    for i in range(1,n):
        
        if i<=int(n/2):
           outer=outer+1
           lstar-=2
            
        else:
            outer=outer-1
            lstar+=2
        
        if i<int(n/2):
            lspace+=1
            rspace+=1
            mspace=n-(lspace+rspace+2)
            print(lspace*"\t",end="")
            print("*\t",end="")
            print(mspace*"\t",end="")
            print("*\t")
            continue
        
        print(outer*"\t",end="")
        print(lstar*"*\t")
        
n=int(input())
pattern(n)
            
    