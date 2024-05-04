class Circulo:
    def __init__(self, color, radio):
        self.color = color
        self.radio = radio

    def area(self):
        import math
        return math.pi * self.radio ** 2

    def perimetro(self):
        import math
        return 2 * math.pi * self.radio

    def get_color(self):
        return self.color

    def get_radio(self):
        return self.radio
