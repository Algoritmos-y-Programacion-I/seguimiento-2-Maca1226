package model;

public class Cuenta {
    private String nombreBanco;
    private EnumCuenta tipoCuenta;
    private double saldoActual;

    public Cuenta(String nombreBanco, EnumCuenta tipoCuenta, double saldoActual) {
        this.nombreBanco = nombreBanco
        this.tipoCuenta = tipoCuenta
        this.saldoActual = saldoActual
    }
    public void depositarDineroCuenta(double cantidad) {
        this.saldoActual += cantidad;
    }
    public void retirarDineroCuenta(double cantidad) {
        if(cantidad <= 0) {
            throw new Error("La cantidad que usted desea retirar debe ser mayor que 0");
        }
        if (cantidad > this.saldoActual) {
            throw new Error("No tienes saldo")
        }
        this.saldoActual -= monto;
    }
    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombre(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public EnumCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(EnumCuenta type) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }


}


    
    






