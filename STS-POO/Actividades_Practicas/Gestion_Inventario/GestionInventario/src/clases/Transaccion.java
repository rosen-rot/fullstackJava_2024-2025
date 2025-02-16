package clases;

import interfaces.Auditable;

public class Transaccion implements Auditable {
    private String idTransaccion;
    private String tipo;
    private double monto;

    // Constructor
    public Transaccion(String idTransaccion, String tipo, double monto) {
        this.idTransaccion = idTransaccion;
        this.tipo = tipo;
        this.monto = monto;
    }

    // Getters y Setters
    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    // Implementación del método registrarAccion
    @Override
    public void registraAccion(String accion) {
        System.out.println("Acción de transacción registrada: " + accion);
    }
}
