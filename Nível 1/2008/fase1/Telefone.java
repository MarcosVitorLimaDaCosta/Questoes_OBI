import java.util.Scanner;

public class Telefone {
   public static void main(String[] args) {
      // https://olimpiada.ic.unicamp.br/pratique/pj/2008/f1/obi/
      Scanner in = new Scanner(System.in);

      String numero = in.nextLine();
      String numeroTraduzido = "";

      for (int i = 0; i < numero.length(); i++) {

         if (numero.charAt(i) > 'V') {
            numeroTraduzido += '9';
         } 
         else if (numero.charAt(i) > 'S') {
            numeroTraduzido += '8';
         } 
         else if (numero.charAt(i) > 'O') {
            numeroTraduzido += '7';
         } 
         else if (numero.charAt(i) > 'L') {
            numeroTraduzido += '6';
         } 
         else if (numero.charAt(i) > 'I') {
            numeroTraduzido += '5';
         } 
         else if (numero.charAt(i) > 'F') {
            numeroTraduzido += '4';
         } 
         else if (numero.charAt(i) > 'C') {
            numeroTraduzido += '3';
         } 
         else if (numero.charAt(i) == '-') {
            numeroTraduzido += numero.charAt(i);
         } 
         else {
            numeroTraduzido += '2';
         }
      }

      System.out.println(numeroTraduzido);
      in.close();
   }
}
