/* Analisis: En este programa se necesita ayudar a Carlos para crear un sistema en el cual 
 puede gestionar la información de sus clientes para que se le facilite su trabajo. En este programa
 se necesitan 5 clases las cuales son: Main, Controller, Cliente, Cuenta y BancoIcesiController. 
 Entradas: int = cantidad de clientes a manejar
           string = nombre
           int = edad
           int = cedula
           int = número de cuentas
           String = banco
           Enum = tipo de cuenta
           
 Salidas: Mensaje de error o confirmación
          Al consultar cliente: imprimir sus datos y detalle de cada cuenta
          Saldo total      
        
*/
package ui;

import java.util.Scanner;

public class BancoIcesiUI {

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para conectar esta clase con el modelo.
     */

    private Scanner input;

    public static void main(String[] args) {

        BancoIcesiUI ui = new BancoIcesiUI();
        ui.menu();

    }

    // Constructor
    public BancoIcesiUI() {
        input = new Scanner(System.in);
    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos
     */

    public void menu() {

        System.out.println("Bienvenido a BancoIcesi");

        int option = 0;
        do {
            System.out.println("\nMenu Principal");
            System.out.println("-".repeat(50));
            System.out.println("Digite alguna de las siguientes opciones");
            System.out.println("1) Registrar cliente");
            System.out.println("2) Asignar cuenta bancaria a cliente");
            System.out.println("3) Depositar dinero en cuenta bancaria de un cliente");
            System.out.println("4) Retirar dinero de una cuenta bancaria de un cliente");
            System.out.println("5) Consultar cliente por numero de cedula");
            System.out.println("6) Consultar el saldo total de todas las cuentas");
            System.out.println("0) Salir del sistema");
            option = input.nextInt();

            switch (option) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    asignarCuentaBancariaCliente();
                    break;
                case 3:
                    depositarDineroCuenta();
                    break;
                case 4:
                    retirarDineroCuenta();
                    break;
                case 5:
                    consultarCliente();
                    break;
                case 6:
                    consultarSaldoTotal();
                    break;
                case 0:
                    System.out.println("\nGracias por usar nuestros servicios. Adios!");
                    break;
                default:
                    System.out.println("\nOpcion invalida. Intente nuevamente.");
                    break;
            }

        } while (option != 0);

    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos
     */

    public void registrarCliente() {

    }

    public void asignarCuentaBancariaCliente() {

    }

    public void depositarDineroCuenta() {

    }

    public void retirarDineroCuenta() {

    }

    public void consultarCliente() {

    }

    public void consultarSaldoTotal() {

    }

}
