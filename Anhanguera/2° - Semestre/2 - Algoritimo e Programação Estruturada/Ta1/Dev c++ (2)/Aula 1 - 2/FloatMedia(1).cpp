#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {
    
    float nota1;
    
    float nota2;
    
    float media;
    
    printf("Insira a nota 1:  ");
    scanf("%f", &nota1);
    
    printf("Insira a nota 2: ");
    scanf("%f", &nota2);
    
    media= (nota1 + nota2)/ 2; 
    
    printf("media = %f", media);


    return (EXIT_SUCCESS);
}

