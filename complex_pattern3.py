def pattern(n):
    spaces = 2*n-3
    left = 1
    t = 1
    for i in range(n):
        k=t
        for i in range(left):
            print("{}{}".format(k,"\t"),end="")
            k=k+1
            
        print(spaces*"\t",end="")
        
        
        if i==n-1:
            k=k-2
            for i in range(left-1):
                print("{}{}".format(k,"\t"),end="")
                k=k-1
        else:   
            k=k-1
            for i in range(left):
                print("{}{}".format(k,"\t"),end="")
                k=k-1
        
        spaces=spaces-2
        left=left+1
        print()
        
    
n = int(input())
pattern(n)