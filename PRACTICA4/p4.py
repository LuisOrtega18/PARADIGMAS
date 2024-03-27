def main():
    #Duplicar los valores de los elementos de una lista.
    lista = list(map(int, input("Ingrese los elementos de la lista separados por espacios: ").split()))
    duplicar = lambda lista: list(map(lambda x: x * 2, lista))
    print("La lista duplicada es:", duplicar(lista))

    # Sumar dos listas.
    l1 = list(map(int, input("Ingrese los elementos de la primera lista separados por espacios: ").split()))
    l2 = list(map(int, input("Ingresa los elementos de la segunda lista separados por espacios: ").split()))
    s_listas = lambda l1, l2: list(map(lambda x, y: x + y, l1, l2))
    print("La suma de las listas es:", s_listas(l1, l2))

    #Duplicar un número si es par y triplicarlo si es impar.
    numero = int(input("Ingrese un número: "))
    duplicar_triplicar = lambda numero: numero * 2 if numero % 2 == 0 else numero * 3
    print("El resultado es:", duplicar_triplicar(numero))

    #Encontrar las vocales de una cadena de texto.
    cadena = input("Ingrese una cadena de texto: ")
    e_vocales = lambda cadena: ''.join(filter(lambda x: x in 'aeiouAEIOU', cadena))
    print("Las vocales en la cadena son:", e_vocales(cadena))

    #Encontrar aquellos valores de una lista que sean divisibles entre 3.
    li_divisible = list(map(int, input("Ingrese los numeros de la lista separados por espacios: ").split()))
    d_tres = lambda lista: list(filter(lambda x: x % 3 == 0, lista))
    print("Los valores divisibles por 3 son:", d_tres(li_divisible))

    #Crear una lista de listas a partir de una lista de entrada.
    li_entrada = input("Ingrese los elementos de la lista de entrada separados por espacios: ").split()
    li_listas = lambda lista: list(map(lambda x: list(x), lista))
    print("La lista de la lista es:", li_listas(li_entrada))

if __name__ == "__main__":
    main()
