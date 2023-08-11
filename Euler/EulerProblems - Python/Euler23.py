import math



def isAbundantNum(n):
    total= 0

    for i in range(2,n):
     
        if n%i == 0:
            total += i

    if total > n:
        return True
    return False

def isAbundantSum(n, abundantList):
    for x in abundantList:
        for y in abundantList:
            if x+y == n:
                return True 
            if y > n:
                break

        if x > n:
            return False
            
    return False 
            
        

    return False

def main():
    total = 0
    
    abundantList = []
    for i in range(28123):
        if isAbundantNum(i):
            abundantList.append(i)


    
    for i in range(28123):
        if isAbundantSum(i, abundantList) == False:
            total += i

    
    print(total)

main()



    


