/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class CuentaAhorro extends CuentaBancaria {

    public CuentaAhorro(int numeroCuenta) {
        super(numeroCuenta);
    }

    @Override
    public void girar(int monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que 0.");
        } else if (monto > 200000) {
            System.out.println("No puede girar más de 200.000 pesos en una sola operación.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo -= monto;
            System.out.println("Giro exitoso. Nuevo saldo: " + saldo + " pesos.");
        }
    }
}
