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

        switch (t) {
            case 0: { // Desktop
                String fab = InputUtils.promptNonEmpty("Fabricante:");
                if (fab == null) {
                    return;
                }
                String mod = InputUtils.promptNonEmpty("Modelo:");
                if (mod == null) {
                    return;
                }
                String micro = InputUtils.promptNonEmpty("Microprocesador:");
                if (micro == null) {
                    return;
                }
                Integer ram = InputUtils.promptPositiveInt("Memoria (RAM) en GB:");
                if (ram == null) {
                    return;
                }
                String gpu = InputUtils.promptNonEmpty("Tarjeta gráfica:");
                if (gpu == null) {
                    return;
                }
                String torre = InputUtils.promptNonEmpty("Tamaño de torre (Mini/Mid/Full):");
                if (torre == null) {
                    return;
                }
                Integer disco = InputUtils.promptPositiveInt("Capacidad disco duro (GB):");
                if (disco == null) {
                    return;
                }

                inv.addDesktop(new Desktop(fab, mod, micro, ram, gpu, torre, disco));
                JOptionPane.showMessageDialog(null, "Desktop registrada correctamente.");
                break;
            }

            case 1: { // Laptop
                String fab = InputUtils.promptNonEmpty("Fabricante:");
                if (fab == null) {
                    return;
                }
                String mod = InputUtils.promptNonEmpty("Modelo:");
                if (mod == null) {
                    return;
                }
                String micro = InputUtils.promptNonEmpty("Microprocesador:");
                if (micro == null) {
                    return;
                }
                Integer ram = InputUtils.promptPositiveInt("Memoria (RAM) en GB:");
                if (ram == null) {
                    return;
                }
                Double pantalla = InputUtils.promptPositiveDouble("Tamaño pantalla (pulgadas):");
                if (pantalla == null) {
                    return;
                }
                Integer disco = InputUtils.promptPositiveInt("Capacidad disco duro (GB):");
                if (disco == null) {
                    return;
                }

                inv.addLaptop(new Laptop(fab, mod, micro, ram, pantalla, disco));
                JOptionPane.showMessageDialog(null, "Laptop registrada correctamente.");
                break;
            }

            case 2: { // Tablet
                String fab = InputUtils.promptNonEmpty("Fabricante:");
                if (fab == null) {
                    return;
                }
                String mod = InputUtils.promptNonEmpty("Modelo:");
                if (mod == null) {
                    return;
                }
                String micro = InputUtils.promptNonEmpty("Microprocesador:");
                if (micro == null) {
                    return;
                }
                Double pantalla = InputUtils.promptPositiveDouble("Tamaño diagonal de pantalla (pulgadas):");
                if (pantalla == null) {
                    return;
                }
                String tipo = InputUtils.promptNonEmpty("¿Capacitiva o Resistiva?");
                if (tipo == null) {
                    return;
                }
                Integer nand = InputUtils.promptPositiveInt("Tamaño memoria NAND (GB):");
                if (nand == null) {
                    return;
                }
                String so = InputUtils.promptNonEmpty("Sistema Operativo:");
                if (so == null) {
                    return;
                }

                inv.addTablet(new Tablet(fab, mod, micro, pantalla, tipo, nand, so));
                JOptionPane.showMessageDialog(null, "Tablet registrada correctamente.");
                break;
            }

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
