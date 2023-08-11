# Algorithm:
#   VARS
    #   Have a Week Dictionary that takes a number for the coresponding
    #   Val for currentDayOfWeek
    #   Val for currentMonth
    #   Val for currentYear
    #   Dictionary with Months and their numbers of days 

#   PROCESS
    #   Start on a Tuesday for january 1st 1901
    #   1. Check if leap year:
    #       if true: add day to February
    #   2. Cycle through Month Dictionary for dayAmount
    #       dayAmount % 7 is how many to add to current day of week 
    #   3. check if day is a sunday
    #       if true +1 to counter 
    #   4. after cycling through months add one to year and repeat 
    #   5. return number of sundays                


def isLeapYear(n):
    if n % 4 == 0:
        True
    else:
        False


def Main(sundayCounter, currDayOfWeek, currYear, weekList, monthList, monthDayNums):
    
    while currYear <= 2000:

        if isLeapYear(currYear):
            monthDayNums["Feb"] = 29
        else:
            monthDayNums["Feb"] = 28

        for i in range(1,13):
            currMonth = monthList[i]
            if weekList[currDayOfWeek] == "Sun":
                sundayCounter+=1

            currDayOfWeek = (currDayOfWeek + monthDayNums[currMonth])%7      

        currYear+=1
           
    return sundayCounter


sundayCounter = 0 
currDayOfWeek = 2
currYear = 1901
weekList = {1:"Mon", 2:"Tue", 3:"Wed", 4:"Thu", 5:"Fri", 6:"Sat", 0:"Sun"}
monthList = {1:"Jan", 2:"Feb", 3:"Mar", 4:"Apr", 5:"May", 6:"Jun", 7:"Jul", 8:"Aug", 9:"Sep", 10:"Oct", 11:"Nov", 12:"Dec"}
monthDayNums = {"Jan": 31, "Feb": 28, "Mar": 31, "Apr": 30, "May": 31, "Jun": 30, "Jul": 31, "Aug": 31, "Sep": 30, "Oct": 31, "Nov": 30, "Dec": 31}

print(Main(sundayCounter, currDayOfWeek, currYear, weekList, monthList, monthDayNums))