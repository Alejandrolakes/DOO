/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alejandrolagosj
 */

package banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = null; // esta vacio porque aun no creamos un cliente
        int opcion; 

        do {
            System.out.println("\n Menu de opciones");
            System.out.println("====================");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Ver datos del cliente");
            System.out.println("3. Depositar");
            System.out.println("4. Girar");
            System.out.println("5. Consultar saldo");
            System.out.println("6. ==== Salir====");
            System.out.print("Seleccione una opción: \n ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> { // descubri que con estas flechas en el case -> no necesitamos break. 
                    String nombre;
                    String rut;
                    String apellidoPaterno;
                    String apellidoMaterno;
                    String domicilio;
                    String comuna; 
                    String telefono; 
                    int numeroCuenta; 

                    System.out.println("Ingrese el nombre del cliente");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese el Rut: ");
                    rut = scanner.nextLine();

                    System.out.println("Ingrese apellido paterno");
                    apellidoPaterno = scanner.nextLine();

                    System.out.println("Ingrese apellido materno");
                    apellidoMaterno = scanner.nextLine();

                    System.out.println("Ingrese domicilio");
                    domicilio = scanner.nextLine();

                    System.out.println("Ingrese comuna");
                    comuna = scanner.nextLine();

                    System.out.println("Ingrese telefono");
                    telefono = scanner.nextLine();

                    System.out.println("Ingrese numero de cuenta: \nSolo de 9 dígitos.");
                    numeroCuenta = scanner.nextInt();
                    scanner.nextLine();

                    Cuenta cuenta = new Cuenta(numeroCuenta);
                    cliente = new Cliente(rut, nombre, apellidoPaterno, apellidoMaterno, domicilio, comuna, telefono, cuenta);
                    System.out.println("Cliente registrado con éxito!");
                }

                case 2 -> {
                    if (cliente != null){
                        cliente.mostrarDatos();
                    }else{
                        System.out.println("No hay datos registrados.");
                    }
                }
                case 3 -> {
                    if (cliente != null){
                        cliente.getCuenta().depositar();
                    }else{
                        System.out.println("Primero se debe registrar un cliente con cuenta");
                    }
                }
                case 4 -> {
                    if (cliente != null){
                        cliente.getCuenta().girar();
                        System.out.println("Su saldo actual es de : "+ cliente.getCuenta().getSaldo());
                    }else {
                        System.out.println("No hay registro de cuenta para girar.");
                    }
                }
                case 5 ->{
                    if (cliente != null){
                        System.out.println("Su saldo es de " + cliente.getCuenta().getSaldo() + " pesos");
                    }else{
                        System.out.println("No hay datos que mostrar.");
                    }
                }
                case 6 -> {
                    System.out.println("Gracias por usar el sistema. Hasta pronto. ");
                }
            }

        } while (opcion != 6);

        System.out.println("\nCierre del programa\n");
    }  
}