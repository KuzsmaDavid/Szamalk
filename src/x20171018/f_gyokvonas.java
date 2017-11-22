/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171018;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author PureD
 */
public class f_gyokvonas {
  
  public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     DecimalFormat df = new DecimalFormat("#.###");
     System.out.println("Kérem a Számot");
     try {
      double szam=scn.nextDouble();
      double negyzetgyok=Math.sqrt(szam);
       if (Double.isNaN(szam)) {
         throw new Exception();
       }
       System.out.println(df.format(szam)+"négyzetgyöke"+df.format(negyzetgyok));
    } 
     catch(InputMismatchException ime){System.err.println("csak szám");}
     catch (Exception e) {
       System.err.println("nonegative");
    }
     
  }
}
