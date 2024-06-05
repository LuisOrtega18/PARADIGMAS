import math

class Figuras:
    def __init__(self, color):
        self.color = color

    def get_color(self):
        return self.color

    def perimetro(self):
        raise NotImplementedError("Subclasses must implement this method")

    def area(self):
        raise NotImplementedError("Subclasses must implement this method")


class Triangulo(Figuras):
    def __init__(self, color, lado1, lado2, lado3):
        super().__init__(color)
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3

    def perimetro(self):
        return self.lado1 + self.lado2 + self.lado3

    def area(self):
        s = self.perimetro() / 2
        return math.sqrt(s * (s - self.lado1) * (s - self.lado2) * (s - self.lado3))


class Circulo(Figuras):
    def __init__(self, color, radio):
        super().__init__(color)
        self.radio = radio

    def perimetro(self):
        return 2 * math.pi * self.radio

    def area(self):
        return math.pi * (self.radio ** 2)


class Rectangulo(Figuras):
    def __init__(self, color, largo, ancho):
        super().__init__(color)
        self.largo = largo
        self.ancho = ancho

    def perimetro(self):
        return 2 * (self.largo + self.ancho)

    def area(self):
        return self.largo * self.ancho


class Hexagono(Figuras):
    def __init__(self, color, lado):
        super().__init__(color)
        self.lado = lado

    def perimetro(self):
        return 6 * self.lado

    def area(self):
        return (3 * math.sqrt(3) * (self.lado ** 2)) / 2


def main():
    triangulo = Triangulo("Azul", 6, 8, 9)
    circulo = Circulo("Amarillo", 6)
    rectangulo = Rectangulo("Verde", 5, 8)
    hexagono = Hexagono("Naranja", 8)

    figuras = [triangulo, circulo, rectangulo, hexagono]

    for figura in figuras:
        print("Color:", figura.get_color())
        print("Perimetro:", figura.perimetro())
        print("Area:", figura.area())
        print()

if __name__ == "__main__":
    main()
