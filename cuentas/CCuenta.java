package cuentas;

/**
 * Clase que representa una cuenta bancaria y sus operaciones básicas
 * @author Rodrigo Martínez Tabernero
 * @version 1.0
 */

public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de cuenta */
    private String cuenta;
    /** Saldo actual de la cuenta */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Obtiene el nombre del titular
     * @return Nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular
     * @param nombre Nuevo nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta
     * @return Número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta
     * @param cuenta Nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual
     * @return Saldo actual de la cuenta
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza una retirada de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
