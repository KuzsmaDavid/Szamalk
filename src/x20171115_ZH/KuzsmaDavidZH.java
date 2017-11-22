
package x20171115_ZH;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
/**
 *
 * @author PureD
 */
public class KuzsmaDavidZH {
  public static void main(String[] args) {
    String[][] valaszok = new String[500][];
    String helyesValasz = "";
    //1.feladat
    File input = new File("valaszok.txt");
    int i = 0;
    try {
      Scanner scn = new Scanner(input);
      helyesValasz = scn.nextLine();
      while (scn.hasNextLine()) {
        String sor = scn.nextLine();
        valaszok[i] = sor.split(" ");
        i++;
      }
      scn.close();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    //1.feladat vége
    //2.feladat kezdete
    System.out.println("2.feladat: A vetélkedőn " + i + " versenyző indult.");
    //3.feladat kezdete
    System.out.println("3.feladat: a versenyző azonosítója=" + valaszok[0][0] + "\n" + valaszok[0][1] + " (a versenyző válasza)");
    //3.feladat vége
    //4.feladat kezdete
    System.out.println("4. feladat:\n" + helyesValasz + " (a helyes válasz)\n" + ellenorzes(valaszok[0][1], helyesValasz));
    //4.feladat vége
    //5.feladat kezdete
    System.out.print("A feladat sorszáma= ");
    Scanner scn2 = new Scanner(System.in);
    int feladatszam = scn2.nextInt();
    int jovalaszok = ellEgyFeladatra(valaszok, helyesValasz, feladatszam, i);
    NumberFormat formatter = new DecimalFormat("#0.00");
    System.out.println(formatter.format(4.0));
    System.out.println("A teladatra " + jovalaszok + " fő, a versenyzők" + formatter.format((double) jovalaszok / i * 100) + "%-a adott helyes választ.");
    //5.feladat vége
    //6.feladat kezdete
    try {
      FileWriter theFile = new FileWriter("pontok.txt");
      BufferedWriter write = new BufferedWriter(theFile);
      for (int j = 1; j < i; j++) {
        write.write(pontozo(valaszok, helyesValasz, j));
        write.newLine();
      }
      write.close();
    } catch (Exception e) {
      System.out.println("i/o hiba: " + e.getMessage());
    }
    //6.feladat vége
  }
  private static String ellenorzes(String valasz, String helyes) {
    String pontozas = "";
    for (int i = 0; i < valasz.length(); i++) {
      if (valasz.charAt(i) == helyes.charAt(i)) {
        pontozas += "+";
      } else {
        pontozas += " ";
      }
    }
    return pontozas;
  }
  private static int ellEgyFeladatra(String[][] valasz, String helyes, int feladat, int vsz) {
    int jovalasz = 0;
    for (int i = 0; i < vsz; i++) {
      if (valasz[i][1].charAt(feladat) == helyes.charAt(feladat)) {
        jovalasz++;
      }
    }
    return jovalasz;
  }
  private static String pontozo(String[][] valaszok, String helyes, int index) {
    String helyesvalasz = ellenorzes(valaszok[index][1], helyes);
    int pont = 0;
    /*
    1-5ig    3 pont 
    6-10ig   4 pont
    11-13ig  5 pont
    14       6 pont
     */
    for (int i = 0; i < helyes.length(); i++) {
      if (helyesvalasz.charAt(i) == '+') {
        if (i >= 4) {
          pont += 3;
        } else if (i >= 5 && i <= 9) {
          pont += 4;
        } else if (i >= 10 && i <= 12) {
          pont += 5;
        } else if (i >= 13) {
          pont += 6;
        }
      }
    }
    return "azonosító" + valaszok[index][0] + " pontszám: " + pont;
  }
}