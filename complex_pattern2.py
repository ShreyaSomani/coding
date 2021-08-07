def pattern(n):
    spaces=int(n/2)
    star=1
    
    t=1
    for i in range(n):
        print(spaces*"\t",end="")
        k=t
        for j in range(star):
            print("{}{}".format(k,"\t"),end="")
            if j<int(star/2):
                k+=1
            else:
                k-=1
            
        print()
        
        if i<int(n/2):
            t+=1
            star+=2
            spaces-=1
        
        else:
            t-=1
            star-=2
            spaces+=1
        
            
n = int(input())
pattern(n)