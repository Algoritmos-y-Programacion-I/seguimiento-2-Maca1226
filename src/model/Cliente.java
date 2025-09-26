package model;

public class Cliente {
    private String nombre;
    private int edad;
    private String cedula;
    private Cuenta[] cuentas;



    public Cliente(String nombre, int edad, String cedula, ){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.cuentas = new Cuenta[10];
     }

    public void getCuentasList() {
        

    }

}
