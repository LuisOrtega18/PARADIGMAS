class Persona:
    def __init__(self, nombre="", edad=0, direccion="", telefono="", email="", genero="", profesion=""):
        self.nombre = nombre
        self.edad = edad
        self.direccion = direccion
        self.telefono = telefono
        self.email = email
        self.genero = genero
        self.profesion = profesion

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_edad(self):
        return self.edad

    def set_edad(self, edad):
        self.edad = edad

    def get_direccion(self):
        return self.direccion

    def set_direccion(self, direccion):
        self.direccion = direccion

    def get_telefono(self):
        return self.telefono

    def set_telefono(self, telefono):
        self.telefono = telefono

    def get_email(self):
        return self.email

    def set_email(self, email):
        self.email = email

    def get_genero(self):
        return self.genero

    def set_genero(self, genero):
        self.genero = genero

    def get_profesion(self):
        return self.profesion

    def set_profesion(self, profesion):
        self.profesion = profesion

# Ejemplo de uso
persona = Persona("Luis", 19, "Tacuba 26", "5545606548", "laortegasal@gmail.com", "Masculino", "Ingeniero")
print("Nombre:", persona.get_nombre())
print("Edad:", persona.get_edad())
print("Direccion:", persona.get_direccion())
print("Telefono:", persona.get_telefono())
print("Email:", persona.get_email())
print("Genero:", persona.get_genero())
print("Profesion:", persona.get_profesion())
