/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(int numeroCuenta) {
        super(numeroCuenta); // Llama al constructor de la clase base
    }

    @Override
    public void girar(int monto) {
        if (monto > 0 && monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Giro exitoso. Nuevo saldo: " + saldo + " pesos.");
        } else if (monto <= 0) {
            System.out.println("El monto debe ser mayor que 0.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}