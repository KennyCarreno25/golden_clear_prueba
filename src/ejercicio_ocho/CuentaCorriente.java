package ejercicio_ocho;

public class CuentaCorriente {

    private String nombre;
    private String apellidos;
    private String edad;
    private String numeroCuenta;
    private double saldo;

    public CuentaCorriente(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(String nombre, String apellidos, String edad, String numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void incrementar() {
        this.saldo++;
    }

    public void decrementar() {
        this.saldo--;
    }

    public void concatenarTexto() {
        System.out.println("Numero Cuenta: " + this.numeroCuenta + " Saldo: " + this.saldo);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad='" + edad + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
