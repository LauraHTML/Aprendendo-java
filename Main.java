import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Saudação hello world");
    Scanner scannerObj = new Scanner(System.in);
    System.out.println("Qual é o seu nome?: ");

    String valorInput = scannerObj.nextLine();
    System.out.println("Olá mundo "+valorInput);
  }
}
