package com.todopc.model;

public class Laptop extends Equipo {
    private int memoriaRamGB;
    private double pantallaPulgadas;
    private int discoDuroGB;

    public Laptop(String fabricante, String modelo, String microprocesador,
                  int memoriaRamGB, double pantallaPulgadas, int discoDuroGB) {
        super(fabricante, modelo, microprocesador);
        this.memoriaRamGB = memoriaRamGB;
        this.pantallaPulgadas = pantallaPulgadas;
        this.discoDuroGB = discoDuroGB;
    }

    public int getMemoriaRamGB() { return memoriaRamGB; }
    public void setMemoriaRamGB(int memoriaRamGB) { this.memoriaRamGB = memoriaRamGB; }

    public double getPantallaPulgadas() { return pantallaPulgadas; }
    public void setPantallaPulgadas(double pantallaPulgadas) { this.pantallaPulgadas = pantallaPulgadas; }

    public int getDiscoDuroGB() { return discoDuroGB; }
    public void setDiscoDuroGB(int discoDuroGB) { this.discoDuroGB = discoDuroGB; }

    @Override
    public String toString() {
        return "[Laptop] " + super.toString() +
                String.format(" | RAM: %dGB | Pantalla: %.1f\" | HDD/SSD: %dGB",
                        memoriaRamGB, pantallaPulgadas, discoDuroGB);
    }
}
