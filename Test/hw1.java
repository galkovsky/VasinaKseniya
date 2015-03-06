/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double x,y,s;
        char o = ' ';
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Введите число");
          x = sc.nextDouble();
        
          System.out.println("Выберите операцию (+,-,*,/)");
                  try {
            o = (char) System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex); // Что он тут написал, я сам не понял, Альт Ентер исправил так, главное, заработало :)
        }
        
        System.out.println("Введите второе число");
        y = sc.nextDouble();        
        
        
        
        switch(o){
            case '+':
                s = x + y;
                System.out.print("=" +s);
                break;
            case '-':
                s = x - y;
                System.out.print("=" +s);
                break;
            case '*':
                s = x * y;
                System.out.print("=" +s);
                break;
            case '/':
                s = x / y;
                System.out.print("=" +s);
                break;
        
        }
        
     
    }
   
}
