def IspalindromPY():
    w=input("Digite a palavra: ").lower()
    s=""
    i=len(w)-1
    while i >= 0:
        s+=w[i]
    if(w==s):
        print("É palíndromo!")
    else:  
        print("Não é Palíndromo")  