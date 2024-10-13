#include <stdio.h>
#include <string.h>

int pila(char *s) {
    int max = 0;
    int n = strlen(s);
    int stack[n + 1];
    int top = -1;
    
    stack[++top] = -1;
    
    for (int i = 0; i < n; i++) {
        if (s[i] == '(') {
            stack[++top] = i;
        } else {
            top--;
            if (top == -1) {
                stack[++top] = i;
            } else {
                int len = i - stack[top];
                if (len > max) {
                    max = len;
                }
            }
        }
    }
    
    return max;
}

int main() {
    char s[100];  // Definimos un tamaño maximo para la cadena

    printf("Ingresa una cadena de parentesis: ");
    scanf("%s", s);

    printf("Input: %s -> Output: %d\n", s, pila(s));

    return 0;
}
