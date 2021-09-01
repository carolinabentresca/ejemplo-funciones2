/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofunciones2;

import java.util.Scanner;


public class EjemploFunciones2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su Nombre....");
        nombre = sc.nextLine();
        mensaje(nombre);
    }
    
    public static void mensaje(String nom){
        System.out.println("*********************");
        System.out.println("Hola  " +  nom  + "  Bienvenid@ al Mundo Java!!!!");
        System.out.println("*********************");
    }
    
}
