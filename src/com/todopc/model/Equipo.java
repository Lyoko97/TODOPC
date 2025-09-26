package com.todopc.model;

public abstract class Equipo {
    private String fabricante;
    private String modelo;
    private String microprocesador;

    public Equipo(String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
    }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMicroprocesador() { return microprocesador; }
    public void setMicroprocesador(String microprocesador) { this.microprocesador = microprocesador; }

    @Override
    public String toString() {
        return String.format("Fabricante: %s | Modelo: %s | Microprocesador: %s",
                fabricante, modelo, microprocesador);
    }
}
