def fraction(mol,den):
    cal = mol % den
    while cal >0:
        mol = den
        den = cal
        cal = mol % den
    return den 

A, B = map(int, input().split())
C, D = map(int, input().split())
num = fraction(A*D + C*B, B*D) 
print((A*D + C*B)//num, B*D//num)
    
