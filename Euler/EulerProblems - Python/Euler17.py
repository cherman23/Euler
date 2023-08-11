import num2words

def Euler17():
    result = 0

    for i in range(1,1000):
        temp = num2words.num2words(i)

        if '-' in temp:
            temp = temp.replace('-','')

        if ' ' in temp:
            temp = temp.replace('','')

        result += len(temp)

    return result

print(Euler17())


