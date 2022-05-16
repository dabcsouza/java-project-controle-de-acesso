package com.trybe.acc.java.controledeacesso;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    short option;
    ArrayList<Short> ages = new ArrayList<>();
    HandleGuest guest = new HandleGuest();
    do {
      System.out.println("Entre com o número correspondente à opção desejada:\n" +
          "1 - Acessar o estabelecimento\n" +
          "2 - Finalizar sistema e mostar relatório");
      option = Short.parseShort(scanner.next());
      if(option != 1 && option != 2) {
        System.out.println("Entre com uma opção válida!");
      } else if (option != 2) {
        System.out.println("Entre com a idade:");
        short age = Short.parseShort(scanner.next());
        guest.checkAge(age);
        ages.add(age);
      }
    } while (option != 2);
    scanner.close();
    guest.generateReport(ages);
  }
}
