import java.util.Scanner;

public abstract class CuentaBancaria {
    protected int numeroCuenta;
    protected int saldo;

    public CuentaBancaria(int numeroCuenta) {
        if (String.valueOf(numeroCuenta).length() != 9) {
            throw new IllegalArgumentException("El número de cuenta debe tener exactamente 9 dígitos.");
        }
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0; // toda cuenta parte con saldo 0
    }

    public CuentaBancaria(int numeroCuenta, int saldoInicial) {
        if (String.valueOf(numeroCuenta).length() != 9) {
            throw new IllegalArgumentException("El número de cuenta debe tener exactamente 9 dígitos.");
        }
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo + " pesos.");
        } else {
            System.out.println("El monto debe ser mayor que 0.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo es de: " + saldo + " pesos");
    }

    public abstract void girar(int monto); // método abstracto que se implementa en las subclases
}