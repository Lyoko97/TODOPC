/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todopc;

import com.todopc.model.Desktop;
import com.todopc.model.Laptop;
import com.todopc.model.Tablet;
import com.todopc.service.Inventario;
import com.todopc.util.InputUtils;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AppTODOPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        String[] menu = {"Registrar", "Mostrar", "Salir"};

        while (true) {
            int sel = InputUtils.optionMenu("Seleccione una opción:", menu);
            if (sel == 2 || sel == JOptionPane.CLOSED_OPTION) {
                break;
            }

            switch (sel) {
                case 0:
                    registrarEquipo(inv);
                    break;
                case 1:
                    mostrarEquipos(inv);
                    break;
                default:
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "¡Gracias por usar TODOPC!");
    }

    private static void registrarEquipo(Inventario inv) {
        String[] tipos = {"Desktop", "Laptop", "Tablet", "Volver"};
        int t = InputUtils.optionMenu("¿Qué tipo desea registrar?", tipos);
        if (t == 3 || t == JOptionPane.CLOSED_OPTION) {
            return;
        }

        String marca = InputUtils.promptNonEmpty("Marca:");
        if (marca == null) {
            return;
        }
        String modelo = InputUtils.promptNonEmpty("Modelo:");
        if (modelo == null) {
            return;
        }
        Double precio = InputUtils.promptPositiveDouble("Precio ($):");
        if (precio == null) {
            return;
        }

        switch (t) {
            case 0: // Desktop
                Integer ramD = InputUtils.promptPositiveInt("RAM (GB):");
                if (ramD == null) {
                    return;
                }
                Integer almD = InputUtils.promptPositiveInt("Almacenamiento (GB):");
                if (almD == null) {
                    return;
                }
                String torre = InputUtils.promptNonEmpty("Tipo de torre (Mini/Mid/Full):");
                if (torre == null) {
                    return;
                }
                inv.addDesktop(new Desktop(marca, modelo, precio, ramD, almD, torre));
                JOptionPane.showMessageDialog(null, "Desktop registrado correctamente.");
                break;

            case 1: // Laptop
                Integer ramL = InputUtils.promptPositiveInt("RAM (GB):");
                if (ramL == null) {
                    return;
                }
                Integer almL = InputUtils.promptPositiveInt("Almacenamiento (GB):");
                if (almL == null) {
                    return;
                }
                Double pulgadas = InputUtils.promptPositiveDouble("Pantalla (pulgadas):");
                if (pulgadas == null) {
                    return;
                }
                Double peso = InputUtils.promptPositiveDouble("Peso (kg):");
                if (peso == null) {
                    return;
                }
                Integer bateria = InputUtils.promptPositiveInt("Batería (Wh):");
                if (bateria == null) {
                    return;
                }
                inv.addLaptop(new Laptop(marca, modelo, precio, ramL, almL, pulgadas, peso, bateria));
                JOptionPane.showMessageDialog(null, "Laptop registrada correctamente.");
                break;

            case 2: // Tablet
                Double pantT = InputUtils.promptPositiveDouble("Pantalla (pulgadas):");
                if (pantT == null) {
                    return;
                }
                Integer almT = InputUtils.promptPositiveInt("Almacenamiento (GB):");
                if (almT == null) {
                    return;
                }
                String conect = InputUtils.promptNonEmpty("Conectividad (WiFi / WiFi+LTE):");
                if (conect == null) {
                    return;
                }
                String so = InputUtils.promptNonEmpty("Sistema Operativo (Android/iPadOS/Windows):");
                if (so == null) {
                    return;
                }
                inv.addTablet(new Tablet(marca, modelo, precio, pantT, almT, conect, so));
                JOptionPane.showMessageDialog(null, "Tablet registrada correctamente.");
                break;
        }
    }

    private static void mostrarEquipos(Inventario inv) {
        String[] tipos = {"Desktop", "Laptop", "Tablet", "Volver"};
        int t = InputUtils.optionMenu("¿Qué tipo desea ver?", tipos);
        if (t == 3 || t == JOptionPane.CLOSED_OPTION) {
            return;
        }

        String resultado;
        switch (t) {
            case 0:
                resultado = inv.listarDesktops();
                break;
            case 1:
                resultado = inv.listarLaptops();
                break;
            case 2:
                resultado = inv.listarTablets();
                break;
            default:
                return;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
