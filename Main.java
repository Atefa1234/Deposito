package cuentas;

/**
 * Clase principal para probar la funcionalidad de CCuenta.
 *
 * @author atefa
 */
public class Main {
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        operativa_cuenta(cuenta1, 2300.0f);
    }

    // Nuevo comentario para el segundo commit
    /**
     * Realiza operaciones de retiro e ingreso en la cuenta.
     *
     * @param cuenta La cuenta a operar
     * @param cantidad Cantidad para retirar e ingresar
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}