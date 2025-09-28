package com.todopc.model;

public class Tablet extends Equipo {
    private double tamanoPantalla;     // diagonal pulgadas
    private String tipoPantalla;       // Capacitiva / Resistiva
    private int memoriaNANDGB;         // GB
    private String sistemaOperativo;

    public Tablet(String fabricante, String modelo, String microprocesador,
                  double tamanoPantalla, String tipoPantalla, int memoriaNANDGB, String sistemaOperivo) {
        super(fabricante, modelo, microprocesador);
        this.tamanoPantalla = tamanoPantalla;
        this.tipoPantalla = tipoPantalla;
        this.memoriaNANDGB = memoriaNANDGB;
        this.sistemaOperativo = sistemaOperivo;
    }

    public double getTamanoPantalla() { return tamanoPantalla; }
    public void setTamanoPantalla(double tamanoPantalla) { this.tamanoPantalla = tamanoPantalla; }

    public String getTipoPantalla() { return tipoPantalla; }
    public void setTipoPantalla(String tipoPantalla) { this.tipoPantalla = tipoPantalla; }

    public int getMemoriaNANDGB() { return memoriaNANDGB; }
    public void setMemoriaNANDGB(int memoriaNANDGB) { this.memoriaNANDGB = memoriaNANDGB; }

    public String getSistemaOperativo() { return sistemaOperativo; }
    public void setSistemaOperativo(String sistemaOperativo) { this.sistemaOperativo = sistemaOperativo; }

    @Override
    public String toString() {
        return "[Tablet] " + super.toString() +
                String.format(" | Pantalla: %.1f\" | Tipo: %s | NAND: %dGB | SO: %s",
                        tamanoPantalla, tipoPantalla, memoriaNANDGB, sistemaOperativo);
    }
}
