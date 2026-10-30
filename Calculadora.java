import java.util.Scanner;

public class Calculadora {
   public static int transformarNumero(String numeroStr){
      int numeroInt = Integer.parseInt(numeroStr);

      return numeroInt;
   };

   public static int somar(int a, int b){
      int resultado = a + b;
      return resultado;
   };

   public static int subtrair(int a, int b){
      int resultado = a - b;
      return resultado;
   };

   public static int multiplicar(int a, int b){
      int resultado = a * b;
      return resultado;
   };

   public static int dividir(int a, int b){
      int resultado = a / b;
      return resultado;
   };
     public static void main(String[] args){
         System.out.println("Calculadora");
         Scanner scanner = new Scanner(System.in);
         System.out.println("Qual operação você vai usar?:");
         System.out.println("1- Soma");
         System.out.println("2- Subtração");
         System.out.println("3- Multiplicação");
         System.out.println("4- Divisão");
         System.out.println("Digite o número para escolher: ");

         String valorMenu = scanner.nextLine();
         int numeroMenu = transformarNumero(valorMenu);

         switch(numeroMenu){
            case 1:
               System.out.println("Soma");
               System.out.println("Digite o primeiro número: ");
               String valorA = scanner.nextLine();
               int numeroA = transformarNumero(valorA);

               System.out.println("Digite o segundo número: ");
               String valorB = scanner.nextLine();
               int numeroB = transformarNumero(valorB);

               somar(numeroA, numeroB);
               int resultado = dividir(numeroA, numeroB);
               System.out.println("O resultado da soma é: "+resultado);
               break;
            case 2:
               System.out.println("Subtrair");
               System.out.println("Digite o primeiro número: ");
               valorA = scanner.nextLine();
               numeroA = transformarNumero(valorA);

               System.out.println("Digite o segundo número: ");
               valorB = scanner.nextLine();
               numeroB = transformarNumero(valorB);

               subtrair(numeroA, numeroB);
               resultado = dividir(numeroA, numeroB);
               System.out.println("O resultado da subtração é: "+resultado);
               break;
            case 3:
               System.out.println("Multiplicar");
               System.out.println("Digite o primeiro número: ");
               valorA = scanner.nextLine();
               numeroA = transformarNumero(valorA);

               System.out.println("Digite o segundo número: ");
               valorB = scanner.nextLine();
               numeroB = transformarNumero(valorB);

               multiplicar(numeroA, numeroB);
               resultado = multiplicar(numeroA, numeroB);
               System.out.println("O resultado da multiplicação é: "+resultado);
               break;
            case 4:
               System.out.println("Dividir");
               System.out.println("Digite o primeiro número: ");
               valorA = scanner.nextLine();
               numeroA = transformarNumero(valorA);

               System.out.println("Digite o segundo número: ");
               valorB = scanner.nextLine();
               numeroB = transformarNumero(valorB);
               
               resultado = dividir(numeroA, numeroB);
               System.out.println("O resultado da divisão é: "+resultado);
               break;
            default:
               System.out.println("O número digitado não é válido ):");
         }
         
     }
}
