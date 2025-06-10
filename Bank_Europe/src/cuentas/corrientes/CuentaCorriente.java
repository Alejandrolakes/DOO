package cuentas.corrientes;

import cuentas.CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(int numeroCuenta) {
        super(numeroCuenta); 
    }

    public CuentaCorriente(int numeroCuenta, int saldoInicial) {
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
        System.out.println("Cuenta Corriente no genera intereses.");
    }
}