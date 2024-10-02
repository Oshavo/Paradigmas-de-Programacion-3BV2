#include <stdio.h>
#include <limits.h>
#include <ctype.h>

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
    printf("%d\n", myAtoi("42")); 
    printf("%d\n", myAtoi("-042"));
    printf("%d\n", myAtoi("1337c0d3"));
    printf("%d\n", myAtoi("0-1"));   
    printf("%d\n", myAtoi("words and 987")); 
    return 0;
}