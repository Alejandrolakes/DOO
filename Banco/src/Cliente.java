/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alejandrolagosj
 */
package banco;
// Se crea la clase Cliente donde guardamos todos sus atributos y metodos.
public class Cliente {
    private String rut; 
    private String nombre; 
    private String apellidoPaterno; 
    private String apellidoMaterno;
    private String domicilio;
    private String comuna;
    private String telefono; 
    private Cuenta cuenta; // este lo usaremos cuando tenga la clase Cuenta. 
    
    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno,
            String domicilio, String comuna, String telefono, Cuenta cuenta){
        this.rut = rut;
        this.nombre = nombre; 
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuenta = cuenta;
        
    }
    // getters
    public String getRut(){
        return rut;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    public String getApellidoMaterno(){
        return apellidoMaterno;
    }
    public Cuenta getCuenta(){
        return cuenta;
    }
    
    public void mostrarDatos(){
        System.out.println("Datos del cliente \n");
        System.out.println("Nombre completo: " + nombre + " " + apellidoPaterno + " "+ apellidoMaterno);
        System.out.println("Rut: "+ rut);
        System.out.println("Domicilio: "+ domicilio);
        System.out.println("Comuna: "+ comuna);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo de la cuenta: " + cuenta.getSaldo() + " pesos");
    }
}
