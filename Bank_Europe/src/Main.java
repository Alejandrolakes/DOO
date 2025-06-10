import clientes.Cliente;
import cuentas.CuentaBancaria;
import cuentas.ahorros.CuentaAhorro;
import cuentas.corrientes.CuentaCorriente;
import cuentas.digital.CuentaDigital;

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
            System.out.println("6. Calcular interés");
            System.out.println("7. ==== Salir ====");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el RUT: ");
                    String rut = scanner.nextLine();
                    System.out.print("Ingrese apellido paterno: ");
                    String apellidoPaterno = scanner.nextLine();
                    System.out.print("Ingrese apellido materno: ");
                    String apellidoMaterno = scanner.nextLine();
                    System.out.print("Ingrese domicilio: ");
                    String domicilio = scanner.nextLine();
                    System.out.print("Ingrese comuna: ");
                    String comuna = scanner.nextLine();
                    System.out.print("Ingrese teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese número de cuenta (9 dígitos): ");
                    int numeroCuenta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Seleccione tipo de cuenta:");
                    System.out.println("1. Cuenta Corriente");
                    System.out.println("2. Cuenta Ahorro");
                    System.out.println("3. Cuenta Digital");
                    int tipoCuenta = scanner.nextInt();
                    scanner.nextLine();

                    CuentaBancaria cuenta = switch (tipoCuenta) {
                        case 1 -> new CuentaCorriente(numeroCuenta);
                        case 2 -> new CuentaAhorro(numeroCuenta);
                        case 3 -> new CuentaDigital(numeroCuenta);
                        default -> null;
                    };

                    if (cuenta != null) {
                        cliente = new Cliente(rut, nombre, apellidoPaterno, apellidoMaterno, domicilio, comuna, telefono, cuenta);
                        System.out.println("Cliente registrado con éxito!");
                    } else {
                        System.out.println("Tipo de cuenta inválido.");
                    }
                }
                case 2 -> {
                    if (cliente != null) {
                        cliente.mostrarInformacionCliente();
                    } else {
                        System.out.println("No hay cliente registrado.");
                    }
                }
                case 3 -> {
                    if (cliente != null) {
                        System.out.print("Ingrese monto a depositar: ");
                        int monto = scanner.nextInt();
                        cliente.getCuenta().depositar(monto);
                    } else {
                        System.out.println("No hay cuenta registrada.");
                    }
                }
                case 4 -> {
                    if (cliente != null) {
                        System.out.print("Ingrese monto a girar: ");
                        int monto = scanner.nextInt();
                        cliente.getCuenta().girar(monto);
                    } else {
                        System.out.println("No hay cuenta registrada.");
                    }
                }
                case 5 -> {
                    if (cliente != null) {
                        cliente.getCuenta().consultarSaldo();
                    } else {
                        System.out.println("No hay cuenta registrada.");
                    }
                }
                case 6 -> {
                    if (cliente != null) {
                        cliente.getCuenta().calcularInteres();
                    } else {
                        System.out.println("No hay cuenta registrada.");
                    }
                }
                case 7 -> System.out.println("Gracias por usar el sistema.");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}