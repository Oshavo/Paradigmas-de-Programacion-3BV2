#include <stdio.h>
#include <stdlib.h> 

int Suma(int n, int nums[n], int target, int *indice1, int *indice2);

int main(){
    int target, n, k, i;
    int *nums;  
    int solucionEncontrada = 0; 
    int indice1 = -1, indice2 = -1; 

    printf("Cuantos numeros deseas agregar en el arreglo? ");
    scanf("%d", &n);

    nums = (int*)malloc(n * sizeof(int));

    printf("Ingresa el numero a buscar (target): ");
    scanf("%d", &target);

    for (k = 0; k < n; k++){
        int valor;
        int repetido = 0;
        int sumaPosible = 0;

        printf("\nIngresa el valor %d: ", k+1);
        scanf("%d", &valor);
        for(i = 0; i < k; i++){
            if(nums[i] == valor){
                repetido = 1;
                break;
            }
           
            if (nums[i] + valor == target) {
                sumaPosible = 1;
                indice1 = i; 
                indice2 = k; 
            }
        }

        if (repetido) {
            printf("No se puede ingresar el mismo numero mas de una vez\n");
            k--;  
        } else if (sumaPosible && solucionEncontrada) {
            printf("Este numero no se puede ingresar porque ya formaria otra solucion con el target.\n");
            k--;  
        } else {
            nums[k] = valor;

            if (sumaPosible) {
                solucionEncontrada = 1;
            }
        }
    }

    if (solucionEncontrada) {
        printf("\nSe encontro una solucion unica: los numeros en los indices %d y %d suman %d.\n", indice1, indice2, target);
    } else {
        Suma(n, nums, target, &indice1, &indice2);
        if (indice1 != -1 && indice2 != -1) {
            printf("\nLos numeros en los indices %d y %d suman %d.\n", indice1, indice2, target);
        } else {
            printf("\nNo se encontro ninguna suma que de como resultado %d.\n", target);
        }
    }

    free(nums);
    return 0;
}

int Suma(int n, int nums[n], int target, int *indice1, int *indice2){
    int suma, i, j;

    for (i = 0; i < n; i++){
        for (j = i + 1; j < n; j++){
            suma = nums[i] + nums[j];
            if (suma == target){
                *indice1 = i; 
                *indice2 = j; 
                return 1; 
            }
        }
    }

    return 0; 
}