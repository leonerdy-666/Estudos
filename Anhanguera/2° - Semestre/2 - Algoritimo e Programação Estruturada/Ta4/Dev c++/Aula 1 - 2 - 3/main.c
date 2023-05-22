#include <stdio.h> 
#include <stdlib.h> 
  
struct Node 
{ 
  int dado; 
  struct Node *next; 
}; 
  
void insere_inicio(struct Node** inicio_ref, int new_dado) 
{ 
    

} 
  

void insere_meio(struct Node* prev_node, int new_dado) 
{ 

} 
  
void insere_fim(struct Node** inicio_ref, int new_dado) 
{ 
       
} 
  
void printList(struct Node *node) 
{ 
  
} 
  
int main() 
{ 
  struct Node* inicio = NULL; 
  
  insere_fim(&inicio, 6); 
  
  insere_inicio(&inicio, 7); 
  
  insere_inicio(&inicio, 1); 
  
  insere_fim(&inicio, 4); 
  
  insere_meio(inicio->next, 8); 
  
  printf("\n Lista Criada: "); 
  printList(inicio); 
  
  return 0; 
}

