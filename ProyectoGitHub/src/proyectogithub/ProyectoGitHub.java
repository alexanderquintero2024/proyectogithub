/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogithub;

/**
 *
 * @author Usuario
 */

import java.math.*;
import java.util.Scanner;

public class ProyectoGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double a,b,e,f,g,h;
    System.out.println("Ingrese la varible A=");
    Scanner leerA =new Scanner(System.in);
    a=leerA.nextDouble();
    
    System.out.println("Ingrese la varible b=");
    Scanner leerb =new Scanner(System.in);
    b=leerb.nextDouble();
    
   
    
    
    e=a+b;        
    f=a*b;
    g=a/b;
    h=Math.abs(a);
    System.out.println("el resultado de la suma es igual a"+e);
    System.out.println("el resultado de la multiplicacion es igual a"+f);
    System.out.println("el resultado de la division es igual a"+g);
    System.out.println("el valor absoluto es= "+h);
    }
    
}
