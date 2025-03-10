package cuentas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author atefa
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

   public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo; // Añadí esto para que el parámetro `tipo` se use
    }
   // Getters
    public String getNombre() { return nombre; }
    public String getCuenta() { return cuenta; }
    public double getSaldo() { return saldo; }
    public double getTipoInterés() { return tipoInterés; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCuenta(String cuenta) { this.cuenta = cuenta; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public void setTipoInterés(double tipoInterés) { this.tipoInterés = tipoInterés; }

    public double estado() {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}
