package com.todopc.util;


import javax.swing.JOptionPane;


public class InputUtils {


public static String promptNonEmpty(String message) {
while (true) {
String input = JOptionPane.showInputDialog(null, message);
if (input == null) return null; // Cancelar
input = input.trim();
if (!input.isEmpty()) return input;
JOptionPane.showMessageDialog(null, "El valor no puede estar vacío.");
}
}


public static Double promptPositiveDouble(String message) {
while (true) {
String s = promptNonEmpty(message);
if (s == null) return null;
try {
double v = Double.parseDouble(s);
if (v >= 0) return v;
} catch (NumberFormatException ignored) {}
JOptionPane.showMessageDialog(null, "Ingrese un número válido (>= 0).");
}
}


public static Integer promptPositiveInt(String message) {
while (true) {
String s = promptNonEmpty(message);
if (s == null) return null;
try {
int v = Integer.parseInt(s);
if (v >= 0) return v;
} catch (NumberFormatException ignored) {}
JOptionPane.showMessageDialog(null, "Ingrese un número entero válido (>= 0).");
}
}


public static int optionMenu(String title, String[] options) {
return JOptionPane.showOptionDialog(
null, title, "TODOPC",
JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
null, options, options[0]
);
}
}