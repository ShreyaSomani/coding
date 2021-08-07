def pattern(n):
    outer=int(n/2)-1
    inner=-1
    lstar=1
    rstar=0
    
    
    for i in range(1,n+1):
        for j in range(1,n+1):
            
            if i<=int(n/2):
                if j==1 or j==n:
                    print("*\t",end="")
                else:
                    print("\t",end="")
            
            else:
                if i==j or i+j==n+1 or j==1 or j==n:
                    print("*\t",end="")
                else:
                    print("\t",end="")
                    
        print()            
                
        
            
            
                
n=int(input())
pattern(n)
                
            
                
            
            