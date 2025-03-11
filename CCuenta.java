package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 *
 * @author atefa
 */
public class CCuenta {

    /** Nombre del titular */
    private String nombre;
    /** Número de cuenta */
    private String cuenta;
    /** Saldo actual */
    private double saldo;
    /** Tipo de interés */
    private double tipoInterés;

    /** Constructor vacío */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nom Nombre del titular
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

    /** @return Nombre del titular */
    public String getNombre() { return nombre; }
    /** @param nombre Nombre a establecer */
    public void setNombre(String nombre) { this.nombre = nombre; }
    /** @return Número de cuenta */
    public String getCuenta() { return cuenta; }
    /** @param cuenta Cuenta a establecer */
    public void setCuenta(String cuenta) { this.cuenta = cuenta; }
    /** @return Saldo actual */
    public double getSaldo() { return saldo; }
    /** @param saldo Saldo a establecer */
    public void setSaldo(double saldo) { this.saldo = saldo; }
    /** @return Tipo de interés */
    public double getTipoInterés() { return tipoInterés; }
    /** @param tipoInterés Tipo de interés a establecer */
    public void setTipoInterés(double tipoInterés) { this.tipoInterés = tipoInterés; }

    /** @return Saldo actual */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa dinero en la cuenta.
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira dinero de la cuenta.
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}