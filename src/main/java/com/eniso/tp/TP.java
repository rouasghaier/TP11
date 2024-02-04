/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp;
import java.util.Scanner;


/**
 *
 * @author rouas
 */
public class TP {
    public static double[] calculateProbability(int[][] image) {
       int n = image[0].length;
       int m = image.length;
       int s = 0;
       double [] p= new double [255] ;
     for ( int k=0 ; k<=255; k++){
      for ( int i=0; i<n ; i++){
          for ( int j=0; j<m; j++){
              if (k == image[i][j]){
                  s+=1;
              }
          }
      }
     p[k]= s/(n*m); 
    }
     return p;
   }
    public static double calculateEntropy(int [][] image) {
        int h=0;
        double [] p=calculateProbability(image);
        for (int i=0; i<=255; i++){
            h+= p[i]*Math.log(p[i]);
        }
        return (-h);
    }

    public static void main(String[] args) {
        System.out.println("Bonjour, mon premier TP en POO");
        // Lecture du npm 
        System.out.println("Quelle est votre nom");
        Scanner read = new Scanner(System.in);
        String name = read.next();
        
        //lecture de l'age
        System.out.println();
        System.out.println("Bonjour"+name);
        System.out.println("Quel est votre age" + name + "?");
        read = new Scanner(System.in);
        int a ;
        a = read.nextInt();
        System.out.println(name + "votre ages est " + a);
    }
    
}
