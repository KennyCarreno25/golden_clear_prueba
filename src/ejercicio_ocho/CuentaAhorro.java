package ejercicio_ocho;

import ejercicio_siete.Cadena;

public class CuentaAhorro extends CuentaCorriente {

    private double interes;

    public CuentaAhorro(String numeroCuenta, int saldo) {
        super(numeroCuenta, saldo);
        this.interes = 15.3;
    }

    public CuentaAhorro(String numeroCuenta, int saldo, double interes) {
        super(numeroCuenta, saldo);
        this.interes = interes;
    }

    public void calcularInteres(){
        Double calcular = this.getSaldo()*this.interes;
        this.setSaldo(calcular);
        System.out.println(calcular);
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

   /* @Override
    public String toString() {
        return "CuentaAhorro{" +
                "interes=" + interes +
                '}';
    }*/
}
