package com.todopc.model;


public class Tablet extends Equipo {
private double pulgadasPantalla;
private int almacenamientoGB;
private String conectividad; // WiFi / WiFi+LTE
private String sistemaOperativo; // Android / iPadOS / Windows


public Tablet(String marca, String modelo, double precio, double pulgadasPantalla, int almacenamientoGB,
String conectividad, String sistemaOperativo) {
super(marca, modelo, precio);
this.pulgadasPantalla = pulgadasPantalla;
this.almacenamientoGB = almacenamientoGB;
this.conectividad = conectividad;
this.sistemaOperativo = sistemaOperativo;
}


public double getPulgadasPantalla() { return pulgadasPantalla; }
public void setPulgadasPantalla(double pulgadasPantalla) { this.pulgadasPantalla = pulgadasPantalla; }
public int getAlmacenamientoGB() { return almacenamientoGB; }
public void setAlmacenamientoGB(int almacenamientoGB) { this.almacenamientoGB = almacenamientoGB; }
public String getConectividad() { return conectividad; }
public void setConectividad(String conectividad) { this.conectividad = conectividad; }
public String getSistemaOperativo() { return sistemaOperativo; }
public void setSistemaOperativo(String sistemaOperativo) { this.sistemaOperativo = sistemaOperativo; }


@Override
public String toString() {
return "[Tablet] " + super.toString() +
String.format(" | Pantalla: %.1f\" | Almacenamiento: %dGB | Conectividad: %s | SO: %s",
pulgadasPantalla, almacenamientoGB, conectividad, sistemaOperativo);
}
}