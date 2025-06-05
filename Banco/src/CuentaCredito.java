/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class CuentaCredito extends CuentaBancaria {

    public CuentaCredito(int numeroCuenta) {
        super(numeroCuenta);
    }

    @Override
    public void girar(int monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que 0.");
        } else {
            saldo -= monto;
            System.out.println("Giro realizado. Su saldo ahora es: " + saldo + " pesos.");
        }
    }
}