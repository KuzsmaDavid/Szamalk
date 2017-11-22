/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171011;

import java.util.Scanner;

/**
 *
 * @author PureD
 */
public class Osztas {
  static boolean sikeres=false;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("kérem az osztandót");
    int osztando = sc.nextInt();
    System.out.println("kérem az osztót");
    int oszto = sc.nextInt();
    try {
      double hanyados = (double) (osztando / oszto);
      System.out.println(osztando + "/" + oszto + "=" + hanyados);
      sikeres=true;
    } catch (ArithmeticException ae) {
      System.out.println(ae.getMessage());
    }
    finally{
      if(sikeres){
        System.out.println("sikeresvót");
      }else{
        System.out.println("sikeretlenvoot");
      }
    }
  }
}
