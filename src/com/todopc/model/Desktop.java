package com.todopc.model;

public class Desktop extends Equipo {
    private int memoriaRamGB;
    private String tarjetaGrafica;
    private String tamanoTorre;     // Mini / Mid / Full
    private int discoDuroGB;

    public Desktop(String fabricante, String modelo, String microprocesador,
                   int memoriaRamGB, String tarjetaGrafica, String tamanoTorre, int discoDuroGB) {
        super(fabricante, modelo, microprocesador);
        this.memoriaRamGB = memoriaRamGB;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.discoDuroGB = discoDuroGB;
    }

    public int getMemoriaRamGB() { return memoriaRamGB; }
    public void setMemoriaRamGB(int memoriaRamGB) { this.memoriaRamGB = memoriaRamGB; }

    public String getTarjetaGrafica() { return tarjetaGrafica; }
    public void setTarjetaGrafica(String tarjetaGrafica) { this.tarjetaGrafica = tarjetaGrafica; }

    public String getTamanoTorre() { return tamanoTorre; }
    public void setTamanoTorre(String tamanoTorre) { this.tamanoTorre = tamanoTorre; }

    public int getDiscoDuroGB() { return discoDuroGB; }
    public void setDiscoDuroGB(int discoDuroGB) { this.discoDuroGB = discoDuroGB; }

    @Override
    public String toString() {
        return "[Desktop] " + super.toString() +
                String.format(" | RAM: %dGB | GPU: %s | Torre: %s | HDD/SSD: %dGB",
                        memoriaRamGB, tarjetaGrafica, tamanoTorre, discoDuroGB);
    }
}
