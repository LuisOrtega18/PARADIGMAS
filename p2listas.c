#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int *g_listas(int n) {
    int *lista = (int *)malloc(n * sizeof(int));
    if (lista == NULL) {
        printf("Ha ocurrido un error en la asignación de memoria.");
        exit(1);
    }

    srand(time(NULL));  

    for (int i = 0; i < n; i++) {
        lista[i] = rand() % 201 - 100; 
    }

    return lista;
}

int minm(int *lista, int n) {
    int min = lista[0];
    for (int i = 1; i < n; i++) {
        if (lista[i] < min) {
            min = lista[i];
        }
    }
    return min;
}

int maxm(int *lista, int n) {
    int max = lista[0];
    for (int i = 1; i < n; i++) {
        if (lista[i] > max) {
            max = lista[i];
        }
    }
    return max;
}

int *s_listas(int *p_lista, int *s_lista, int n) {
    int *suma_listas = (int *)malloc(n * sizeof(int));
    if (suma_listas == NULL) {
        printf("Ha ocurrido un error en la asignación de memoria.");
        exit(1);
    }

    for (int i = 0; i < n; i++) {
        suma_listas[i] = p_lista[i] + s_lista[i];
    }

    return suma_listas;
}

void s_listas_v2(int *p_lista, int *s_lista, int n) {
    int *resultado = s_listas(p_lista, s_lista, n);

    printf("Las listas sumadas son: \n");
    for (int i = 0; i < n; i++) {
        printf("%d ", resultado[i]);
    }
    printf("\n");

    free(resultado);
}

int main() {
    int n = 10;
    int *p_lista = g_listas(n);
    int *s_lista = g_listas(n);

    printf("Primer lista: \n");
    for (int i = 0; i < n; i++) {
        printf("%d ", p_lista[i]);
    }
    printf("\n");

    printf("Segunda lista: \n");
    for (int i = 0; i < n; i++) {
        printf("%d ", s_lista[i]);
    }
    printf("\n");

    printf("El minimo de la primer lista es: \n%d\n", minm(p_lista, n));
    printf("El maximo de la primer lista es: \n%d\n", maxm(p_lista, n));
    printf("El minimo de la segunda lista es: \n%d\n", minm(s_lista, n));
    printf("El maximo de la segunda lista es: \n%d\n", maxm(s_lista, n));

    s_listas_v2(p_lista, s_lista, n);

    free(p_lista);
    free(s_lista);

    return 0;
}