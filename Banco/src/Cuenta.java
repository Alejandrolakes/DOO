

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

public class Cuenta {
    private int numeroCuenta; //hacer una verificacion de que solo contena 9 digitos no mas ni menos
    private int saldo; 
    
    public Cuenta(int numeroCuenta){ // constructor que recibe el numero de cuenta y deja el saldo en 0
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0; // toda cuenta parte en cero
    }
    
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public void depositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese monto a dopositar");
        int monto = scanner.nextInt();
        if (monto > 0){
            saldo += monto; // suma el monto al saldo actual.
            System.out.println("Deposito realizado con exito! ");
            System.out.println("Nuevo saldo de: "+ saldo+ "pesos");
        }else {
            System.out.println("El monto no puede ser menor a 0, ingrese monto valido ");
        }
        
    }
    
    public void girar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto que desea girar: \n");
        int giro = scanner.nextInt();
        
        if (giro > 0 ){
            if (giro <= saldo){
                saldo = saldo - giro; 
                System.out.println("Su giro se realizo con exito");
                System.out.println("Su nuevo saldo es de " + saldo + " pesos");
                
            }else{
                System.out.println("Su saldo un insuficiente!\n Ingrese un monto correcto \n");
            }
        }else {
            System.out.println("Ingrese monto mayor a 0");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo es de: " + saldo + " pesos");
    }
    
            
}
