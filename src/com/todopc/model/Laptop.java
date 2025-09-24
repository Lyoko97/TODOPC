package com.todopc.model;


public class Laptop extends Equipo {
private int ramGB;
private int almacenamientoGB;
private double pulgadasPantalla; // 13.3, 14, 15.6
private double pesoKg; // 1.2, 2.1, etc.
private int bateriaWh; // capacidad de batería


public Laptop(String marca, String modelo, double precio, int ramGB, int almacenamientoGB,
double pulgadasPantalla, double pesoKg, int bateriaWh) {
super(marca, modelo, precio);
this.ramGB = ramGB;
this.almacenamientoGB = almacenamientoGB;
this.pulgadasPantalla = pulgadasPantalla;
this.pesoKg = pesoKg;
this.bateriaWh = bateriaWh;
}


public int getRamGB() { return ramGB; }
public void setRamGB(int ramGB) { this.ramGB = ramGB; }
public int getAlmacenamientoGB() { return almacenamientoGB; }
public void setAlmacenamientoGB(int almacenamientoGB) { this.almacenamientoGB = almacenamientoGB; }
public double getPulgadasPantalla() { return pulgadasPantalla; }
public void setPulgadasPantalla(double pulgadasPantalla) { this.pulgadasPantalla = pulgadasPantalla; }
public double getPesoKg() { return pesoKg; }
public void setPesoKg(double pesoKg) { this.pesoKg = pesoKg; }
public int getBateriaWh() { return bateriaWh; }
public void setBateriaWh(int bateriaWh) { this.bateriaWh = bateriaWh; }


@Override
public String toString() {
return "[Laptop] " + super.toString() +
String.format(" | RAM: %dGB | Almacenamiento: %dGB | Pantalla: %.1f\" | Peso: %.2fkg | Batería: %dWh",
ramGB, almacenamientoGB, pulgadasPantalla, pesoKg, bateriaWh);
}
}