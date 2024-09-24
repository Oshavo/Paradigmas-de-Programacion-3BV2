#include <stdio.h>
#include <stdlib.h>

int main(){

    int num, i=0, size;
    int numeros[10];
    printf("Ingresa un numero : ");
    scanf("%d", &num); 

    int temp = num; 
    int cantidad = 0;
    while (temp > 0) {
        cantidad++;
        temp /= 10;  
    }

    printf("%d", cantidad);

    temp = num;
    for (int i = cantidad - 1; i >= 0; i--) { 
        numeros[i] = temp % 10; 
        temp /= 10; 
    }

    int a = 0;
    for (int i = 0, j = cantidad - 1; i < cantidad / 2 ; i++, j--) {
        if(numeros[i] == numeros[j]){
            a=1;
        }else{
            break;
        }
    }

    if(a == 1){
        printf("Si es un palindromo");
    }else{
        printf("No es un palindromo");
    }



    

    return 0;
}