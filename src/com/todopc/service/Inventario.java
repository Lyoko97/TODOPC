package com.todopc.service;


import com.todopc.model.Desktop;
import com.todopc.model.Laptop;
import com.todopc.model.Tablet;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Inventario {
private final List<Desktop> desktops = new ArrayList<>();
private final List<Laptop> laptops = new ArrayList<>();
private final List<Tablet> tablets = new ArrayList<>();


// Agregar
public void addDesktop(Desktop d) { desktops.add(d); }
public void addLaptop(Laptop l) { laptops.add(l); }
public void addTablet(Tablet t) { tablets.add(t); }


// Listar (como String formateado para JOptionPane)
public String listarDesktops() {
if (desktops.isEmpty()) return "No hay Desktops registrados.";
return desktops.stream().map(Object::toString).collect(Collectors.joining("\n"));
}
public String listarLaptops() {
if (laptops.isEmpty()) return "No hay Laptops registradas.";
return laptops.stream().map(Object::toString).collect(Collectors.joining("\n"));
}
public String listarTablets() {
if (tablets.isEmpty()) return "No hay Tablets registradas.";
return tablets.stream().map(Object::toString).collect(Collectors.joining("\n"));
}
}