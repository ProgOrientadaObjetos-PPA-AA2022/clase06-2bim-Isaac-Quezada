/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Enlace c = new Enlace();
        boolean bandera = true;
        int salir = 0;
        while (bandera) {
            System.out.println("Ingrese la placa del Auto");
            String au = sc.nextLine();
            System.out.println("Ingrese el numero de la Matricula");
            int ma = sc.nextInt();

            Auto auto1 = new Auto();
            auto1.establecerPlaca(au);
            auto1.establecerValorMatricula(ma);
            c.insertarAuto(auto1);

            System.out.println("Ingrese 2 si desea salir del programa");
            salir = sc.nextInt();

            if (salir == 2) {
                bandera = false;
            }
            sc.nextLine();
        }
    }
}

//Auto a = new Auto();
        //a.establecerPlaca("LBNS0001");
        //a.establecerValorMatricula(200.2);
        
        //c.insertarAuto(a);
        
        //for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
          //  System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        //}