/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = null;
        int opcion;

        do {
            System.out.println("\n Menu de opciones");
            System.out.println("====================");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Ver datos del cliente");
            System.out.println("3. Depositar");
            System.out.println("4. Girar");
            System.out.println("5. Consultar saldo");
            System.out.println("6. ==== Salir ====");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    String nombre, rut, apellidoPaterno, apellidoMaterno;
                    String domicilio, comuna, telefono;
                    int numeroCuenta, tipoCuenta;
                    CuentaBancaria cuenta;

                    System.out.println("Ingrese el nombre del cliente:");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese el RUT:");
                    rut = scanner.nextLine();

                    System.out.println("Ingrese apellido paterno:");
                    apellidoPaterno = scanner.nextLine();

                    System.out.println("Ingrese apellido materno:");
                    apellidoMaterno = scanner.nextLine();

                    System.out.println("Ingrese domicilio:");
                    domicilio = scanner.nextLine();

                    System.out.println("Ingrese comuna:");
                    comuna = scanner.nextLine();

                    System.out.println("Ingrese teléfono:");
                    telefono = scanner.nextLine();

                    System.out.println("Ingrese número de cuenta (9 dígitos):");
                    numeroCuenta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Seleccione tipo de cuenta:");
                    System.out.println("1. Cuenta Corriente");
                    System.out.println("2. Cuenta Ahorro");
                    System.out.println("3. Cuenta Crédito");
                    tipoCuenta = scanner.nextInt();
                    scanner.nextLine();

                    if (tipoCuenta == 1) {
                        cuenta = new CuentaCorriente(numeroCuenta);
                    } else if (tipoCuenta == 2) {
                        cuenta = new CuentaAhorro(numeroCuenta);
                    } else {
                        cuenta = new CuentaCredito(numeroCuenta);
                    }

                    cliente = new Cliente(rut, nombre, apellidoPaterno, apellidoMaterno,
                                          domicilio, comuna, telefono, cuenta);

                    System.out.println("Cliente registrado con éxito.");
                }

                case 2 -> {
                    if (cliente != null) {
                        cliente.mostrarInformacion();
                    } else {
                        System.out.println("No hay datos registrados.");
                    }
                }

                case 3 -> {
                    if (cliente != null) {
                        cliente.getCuenta().depositar();
                    } else {
                        System.out.println("Primero debe registrar un cliente.");
                    }
                }

                case 4 -> {
                    if (cliente != null) {
                        System.out.print("Ingrese monto a girar: ");
                        int monto = scanner.nextInt();
                        scanner.nextLine();
                        cliente.getCuenta().girar(monto);
                    } else {
                        System.out.println("No hay cuenta registrada.");
                    }
                }

                case 5 -> {
                    if (cliente != null) {
                        cliente.getCuenta().consultarSaldo();
                    } else {
                        System.out.println("No hay datos que mostrar.");
                    }
                }

                case 6 -> System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
            }

        } while (opcion != 6);

        System.out.println("\nCierre del programa.");
    }
}