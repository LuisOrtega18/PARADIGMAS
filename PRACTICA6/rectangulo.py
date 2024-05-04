class Rectangulo:
    def __init__(self, color, largo, ancho):
        self.color = color
        self.largo = largo
        self.ancho = ancho

    def area(self):
        return self.largo * self.ancho

    def perimetro(self):
        return 2 * (self.largo + self.ancho)

    def get_color(self):
        return self.color

    def get_dimensiones(self):
        return self.largo, self.ancho
