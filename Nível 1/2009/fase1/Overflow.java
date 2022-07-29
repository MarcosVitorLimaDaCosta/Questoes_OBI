import java.util.Scanner;

public class Overflow {
   public static void main(String[] args) {
      // https://olimpiada.ic.unicamp.br/pratique/pj/2009/f1/overflow/
      Scanner in = new Scanner(System.in);

      int numeroLimite = in.nextInt();
      int n1 = in.nextInt();
      String operacao = in.next(), saida = "OVERFLOW";
      int n2 = in.nextInt();

      if (operacao.charAt(0) == '+' && n1 + n2 <= numeroLimite) {
         saida = "OK";
      } 
      else if (operacao.charAt(0) == '*' && n1 * n2 <= numeroLimite) {
         saida = "OK";
      }

      System.out.println(saida);

      in.close();
   }
}
