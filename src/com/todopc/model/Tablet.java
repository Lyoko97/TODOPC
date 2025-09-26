package com.todopc.model;

public class Tablet extends Equipo {
    private String microprocesador;
    private double tamanoPantalla;
    private String tipoPantalla; // Capacitiva / Resistiva
    private int memoriaNAND;     // en GB
    private String sistemaOperativo;

    public Tablet(String fabricante, String modelo, double precio, 
                  String microprocesador, double tamanoPantalla, 
                  String tipoPantalla, int memoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, precio);
        this.microprocesador = microprocesador;
        this.tamanoPantalla = tamanoPantalla;
        this.tipoPantalla = tipoPantalla;
        this.memoriaNAND = memoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMicroprocesador() { return microprocesador; }
    public void setMicroprocesador(String microprocesador) { this.microprocesador = microprocesador; }

    public double getTamanoPantalla() { return tamanoPantalla; }
    public void setTamanoPantalla(double tamanoPantalla) { this.tamanoPantalla = tamanoPantalla; }

    public String getTipoPantalla() { return tipoPantalla; }
    public void setTipoPantalla(String tipoPantalla) { this.tipoPantalla = tipoPantalla; }

    public int getMemoriaNAND() { return memoriaNAND; }
    public void setMemoriaNAND(int memoriaNAND) { this.memoriaNAND = memoriaNAND; }

    public String getSistemaOperativo() { return sistemaOperativo; }
    public void setSistemaOperativo(String sistemaOperativo) { this.sistemaOperativo = sistemaOperativo; }

    @Override
    public String toString() {
        return "[Tablet] " + super.toString() +
               String.format(" | Microprocesador: %s | Pantalla: %.1f\" | Tipo: %s | Memoria NAND: %dGB | SO: %s",
                             microprocesador, tamanoPantalla, tipoPantalla, memoriaNAND, sistemaOperativo);
    }
}
