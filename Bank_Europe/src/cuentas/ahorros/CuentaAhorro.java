package cuentas.ahorros;

import cuentas.CuentaBancaria;

public class CuentaAhorro extends CuentaBancaria {

    public CuentaAhorro(int numeroCuenta) {
        super(numeroCuenta);
    }

    public CuentaAhorro(int numeroCuenta, int saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    @Override
    public void girar(int monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor a 0.");
        } else if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Giro exitoso. Nuevo saldo: " + saldo + " pesos.");
        } else {
            System.out.println("Fondos insuficientes para el giro.");
        }
    }

    @Override
    public void calcularInteres() {
        double interes = saldo * 0.02;
        System.out.println("El interés generado es: " + (int)interes + " pesos.");
    }
}