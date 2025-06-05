
public class Cliente implements InformacionCliente {
    private String rut; 
    private String nombre; 
    private String apellidoPaterno; 
    private String apellidoMaterno;
    private String domicilio;
    private String comuna;
    private String telefono; 
    private CuentaBancaria cuenta; // Ahora usamos la clase base abstracta
    
    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno,
                   String domicilio, String comuna, String telefono, CuentaBancaria cuenta) {
        this.rut = rut;
        this.nombre = nombre; 
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuenta = cuenta;
    }

    // Getters
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    // Método heredado de la interfaz InformacionCliente
    @Override
    public void mostrarInformacion() {
        System.out.println("Datos del cliente");
        System.out.println("Nombre completo: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno);
        System.out.println("RUT: " + rut);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Comuna: " + comuna);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo de la cuenta: " + cuenta.getSaldo() + " pesos");
    }
}