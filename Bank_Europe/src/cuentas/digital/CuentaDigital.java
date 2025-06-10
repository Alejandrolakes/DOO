package cuentas.digital;

import cuentas.CuentaBancaria;

public class CuentaDigital extends CuentaBancaria {

    public CuentaDigital(int numeroCuenta) {
        super(numeroCuenta);
    }

    public CuentaDigital(int numeroCuenta, int saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    @Override
    public void girar(int monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor a 0.");
        } else if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Giro realizado exitosamente. Saldo actual: " + saldo + " pesos.");
        } else {
            System.out.println("No se puede realizar el giro. Fondos insuficientes.");
        }
    }

    @Override
    public void calcularInteres() {
        double interes = saldo * 0.01;
        System.out.println("El interés generado para la cuenta digital es: " + (int)interes + " pesos.");
    }
}