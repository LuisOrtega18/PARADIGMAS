class Cuadrado:
    def __init__(self, color, lado):
        self.color = color
        self.lado = lado

    def area(self):
        return self.lado ** 2

    def perimetro(self):
        return 4 * self.lado

    def get_color(self):
        return self.color

    def get_lado(self):
        return self.lado
