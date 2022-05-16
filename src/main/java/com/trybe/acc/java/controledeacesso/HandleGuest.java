package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;

public class HandleGuest {
  /**
   * Handle ranges of ages.
   */
  public void checkAge(short age) {
    if (age < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    } else if (age < 50) {
      System.out.println("Pessoa adulta, catraca liberada!");
    } else {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
    }
  }

  /**
   *Generate access report.
   */
  public void generateReport(ArrayList<Short> ages) {
    int minor = 0;
    int major = 0;
    int senior = 0;

    for (Short age : ages) {
      if (age < 18) {
        minor++;
      } else if (age < 50) {
        major++;
      } else {
        senior++;
      }
    }
    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + minor);
    System.out.println("adultas: " + major);
    System.out.println("a partir de 50: " + senior);
    int total = senior + major + minor;
    if (total != 0) {
      float perMinor = ((float) minor / (float) total) * 100;
      float perMajor = ((float) major / (float) total) * 100;
      float perSenior = ((float) senior / (float) total) * 100;
      System.out.println("----- Percentual -----");
      System.out.printf("menores: %.1f", perMinor);
      System.out.println("%");
      System.out.printf("adultas: %.1f", perMajor);
      System.out.println("%");
      System.out.printf("a partir de 50: %.1f", perSenior);
      System.out.println("%");
    }

  }
}
