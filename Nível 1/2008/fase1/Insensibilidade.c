#include <stdio.h>

int main(int argc, char const *argv[]){
   // https://olimpiada.ic.unicamp.br/pratique/p1/2008/f1/insens/
   int n, x1, y1, x2, y2, quad, soma = 0;
   scanf("%d", &n);

   for (int i = 0; i < n; i++)
   {
      scanf("%d %d %d %d", &x1, &y1, &x2, &y2);

      quad = (x1 - x2) * (x1 - x2);
      soma += quad;

      quad = (y1 - y2) * (y1 - y2);
      soma += quad;
   }

   printf("%d", soma);
   return 0;
}
