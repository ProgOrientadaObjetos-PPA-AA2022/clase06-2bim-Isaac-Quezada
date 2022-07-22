/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Enlace c = new Enlace();
        //Ciudad ciudad = new Ciudad("Machala", 400121);
        //c.insertarCiudad(ciudad);

        boolean bandera = true;
        int salir = 0;
        while (bandera) {
            System.out.println("Ingrese el nombre de la Ciudad");
            String n = sc.nextLine();
            System.out.println("Ingrese el numero de poblacion de la Ciudad");
            int pob = sc.nextInt();

            Ciudad ciudad = new Ciudad(n, pob);
            c.insertarCiudad(ciudad);

            System.out.println("Ingrese 2 si desea salir del programa");
            salir = sc.nextInt();

            if (salir == 2) {
                bandera = false;
            }
            sc.nextLine();
        }

        //for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
        //  System.out.printf("%s", c.obtenerDataCiudad().get(i));
        //}
    }
}
