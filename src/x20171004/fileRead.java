/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171004;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Kuzsma Dávid
 */
public class fileRead {
    public static void main(String[] args)throws Exception{
        File theFile =new File("input.txt");
        try {
            Scanner eyes = new Scanner(theFile);
            while (eyes.hasNextLine()) {                
             String sor=eyes.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
