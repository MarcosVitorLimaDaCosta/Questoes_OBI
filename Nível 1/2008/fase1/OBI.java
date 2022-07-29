import java.util.Scanner;

public class OBI {
   public static void main(String[] args) {
      // https://olimpiada.ic.unicamp.br/pratique/pj/2008/f1/obi/
      Scanner in = new Scanner(System.in);

      int numeroCompetidores = in.nextInt();
      int pontosMinimos = in.nextInt();
      int competidoresConvidados = 0;

      for (int i = 0; i < numeroCompetidores; i++) {
         int ponto1 = in.nextInt();
         int ponto2 = in.nextInt();

         if (ponto1 + ponto2 >= pontosMinimos) {
            competidoresConvidados++;
         }
      }

      System.out.println(competidoresConvidados);
      in.close();
   }
}
