#include <stdio.h>
#include <limits.h>

int myAtoi(const char *s) {

    
    // Variable para el resultado y el signo
    long resultado = 0;
    int sign = 1;

    while (*s == ' ') {
        s++;
    }

    if (*s == '-') {
        sign = -1;
        s++;
    } else if (*s == '+') {
        s++;
    }

    while (*s >= '0' && *s <= '9') {
        resultado = resultado * 10 + (*s - '0');
        
        if (resultado * sign > INT_MAX) {
            return INT_MAX;
        }
        if (resultado * sign < INT_MIN) {
            return INT_MIN;
        }
        
        s++;
    }
    
    return (int)(resultado * sign);
}


int main() {
    char input[100];

    printf("Ingrese una cadena para convertir a entero: ");
    fgets(input, sizeof(input), stdin);

    int resultado = myAtoi(input);

    printf("El número convertido es: %d\n", resultado);

    return 0;
}