import math

def main():
    menu()
    x = int(input())

    while(x != 0):
        if(x == 1):
            print("Método do Trapézio")
            metodoTrapezio()
        if(x == 2):
            print("Método de Simpson")
            metodoSimpson()
        menu()
        x = int(input())
        if(x == 0):
            print("Até a próxima xD")



def menu():
    print("Escolha uma opção (para o cálculo aproximado da integral): ")
    print("1 - Metodo Trapezio")
    print("2 - Metodo de Simpson")
    print("0 - sair")


def metodoTrapezio():
    f = input("f(x) = ")
    x0 = float(input("Limite inferior: "))
    xM = float(input("Limite superior: "))
    h = float(input("valor do n: "))
    integral = 0
    x = x0
    integral += eval(f)
    x += h
    while x < xM:
        integral += 2 * eval(f)
        x += h
    x = xM
    integral += eval(f)
    integral *= (h / 2)
    print("Integral=", integral)


def metodoSimpson():
    f = input("f(x) = ")
    x0 = float(input("Limite inferior: "))
    xM = float(input("Limite superior: "))
    h = float(input("valor do n: "))
    integral = 0
    x = x0
    integral += eval(f)
    x += h
    indice = 1
    while x < xM:
        if indice%2!=0:
            integral += 4*eval(f)
        else:
            integral += 2*eval(f)
        indice += 1
        x += h
    x = xM
    integral += eval(f)
    integral *= (h/3)
    print("Integral = ", integral)


main()