package com.todopc.model;


public class Desktop extends Equipo {
private int ramGB;
private int almacenamientoGB;
private String tipoTorre; // Mini/Mid/Full Tower


public Desktop(String marca, String modelo, double precio, int ramGB, int almacenamientoGB, String tipoTorre) {
super(marca, modelo, precio);
this.ramGB = ramGB;
this.almacenamientoGB = almacenamientoGB;
this.tipoTorre = tipoTorre;
}


public int getRamGB() { return ramGB; }
public void setRamGB(int ramGB) { this.ramGB = ramGB; }


public int getAlmacenamientoGB() { return almacenamientoGB; }
public void setAlmacenamientoGB(int almacenamientoGB) { this.almacenamientoGB = almacenamientoGB; }


public String getTipoTorre() { return tipoTorre; }
public void setTipoTorre(String tipoTorre) { this.tipoTorre = tipoTorre; }


@Override
public String toString() {
return "[Desktop] " + super.toString() +
String.format(" | RAM: %dGB | Almacenamiento: %dGB | Torre: %s", ramGB, almacenamientoGB, tipoTorre);
}
}