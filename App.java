/*
* File: App.java
* Author: Juhász Roland
* Copyright: 2022, Juhász Roland
* Group: Szoft I N 
* Date: 2022-02-16
* Github: https://github.com/jani/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class App {
  public static void main(String[] args) {
    System.out.println("Juhász Roland");
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("alap:");
      double alap = sc.nextDouble();


      System.out.print("Magasság:");
      double magassag = sc.nextDouble();

      double terulet = (alap * magassag) / 2;
      System.out.print("Terület:" + terulet);
    }
  }
}
