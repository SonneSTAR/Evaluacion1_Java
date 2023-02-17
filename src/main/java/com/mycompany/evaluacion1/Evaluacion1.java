/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evaluacion1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ricar
 */
public class Evaluacion1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Declaración de variables y listas a utilizar.
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList> master = new ArrayList<ArrayList>(); 
        
        String atributo0;
        String atributo1;
        String atributo2;
        String atributo3;
        String atributo4;
        String atributo5;
        String atributo6;
        String atributo7;
        String atributo8;
        String atributo9;
        
        ArrayList<String> instancia = new ArrayList<String>(); 

/*       ArrayList<String> atributo1 = new ArrayList<String>(); //Atributo1: Nacimiento, Obligatorio
        ArrayList<String> atributo2 = new ArrayList<String>(); //Atributo2: RUT, Obligatorio
        ArrayList<String> atributo3 = new ArrayList<String>(); //Atributo3: Direccion, Obligatorio
        ArrayList<String> atributo4 = new ArrayList<String>(); //Atributo4: Telefono, Obligatorio
        ArrayList<String> atributo5 = new ArrayList<String>(); //Atributo5: Cantidad Empleados, Obligatorio
        ArrayList<String> atributo6 = new ArrayList<String>(); //Atributo6: Experiencia
        ArrayList<String> atributo7 = new ArrayList<String>(); //Atributo7: Departamento, Obligatorio
        ArrayList<String> atributo8 = new ArrayList<String>(); //Atributo8: Funcion, Obligatorio
        ArrayList<String> atributo9 = new ArrayList<String>(); //Atributo9: Superior
*/
    
        //Variables locales de la funcion.
        String input;
        
        System.out.println("Ingrese tipo de Usuario a Registrar: (C/P/A)");
        System.out.println("C: Cliente, P: Profesional, A: Administrativo");
        input = scan.nextLine();
        
        if (input.equals("C")) {
            System.out.println("Ingrese NOMBRE: ");
            atributo0 = scan.nextLine();
            System.out.println("Ingrese Apellido: ");
            atributo1 = scan.nextLine();
            
            
            instancia.add(atributo0);
            instancia.add(atributo1);
            master.add(instancia);
            
            System.out.println(master.get(0).get(0));
        }
        else if (input.equals("P")) {
            
        }
        else if (input.equals("A")) {
            
        }
        else {
            
        }
    }
}
