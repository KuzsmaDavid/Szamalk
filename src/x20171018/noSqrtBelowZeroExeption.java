/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171018;

/**
 *
 * @author PureD
 */
public class noSqrtBelowZeroExeption extends Exception{
  // Parameterless Constructor
      public noSqrtBelowZeroExeption() {}

      // Constructor that accepts a message
      public noSqrtBelowZeroExeption(String message)
      {
         super(message);
      }
}
