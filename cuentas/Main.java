//Paso 1, englobar en un paquete cuentas las clases CCuenta y Main
package cuentas;

public class Main {
    public static void main(String[] args) {
        //En el paso 3 hemos refactorizado el método main para que llame a operativa_cuenta
        operativa_cuenta();
    }

    public static void operativa_cuenta(){
        //En el paso 2 hemos renombrado la variable  a cuenta1
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
