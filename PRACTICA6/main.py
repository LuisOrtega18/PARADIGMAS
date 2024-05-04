from circulo import Circulo
from rectangulo import Rectangulo
from cuadrado import Cuadrado

def main():
    print("Seleccione la figura para calcular área y perímetro:")
    print("1. Círculo\n2. Rectángulo\n3. Cuadrado")
    choice = int(input())

    if choice == 1:
        color = input("Ingrese el color del círculo: ")
        radio = float(input("Ingrese el radio del círculo: "))
        circulo = Circulo(color, radio)
        print(f"Área: {circulo.area()}, Perímetro: {circulo.perimetro()}")
    elif choice == 2:
        color = input("Ingrese el color del rectángulo: ")
        largo = float(input("Ingrese el largo del rectángulo: "))
        ancho = float(input("Ingrese el ancho del rectángulo: "))
        rectangulo = Rectangulo(color, largo, ancho)
        print(f"Área: {rectangulo.area()}, Perímetro: {rectangulo.perimetro()}")
    elif choice == 3:
        color = input("Ingrese el color del cuadrado: ")
        lado = float(input("Ingrese el lado del cuadrado: "))
        cuadrado = Cuadrado(color, lado)
        print(f"Área: {cuadrado.area()}, Perímetro: {cuadrado.perimetro()}")
    else:
        print("Opción no válida.")

if __name__ == '__main__':
    main()
