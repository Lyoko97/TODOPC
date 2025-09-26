# TODOPC – Registro de Equipos

Proyecto UDB en **Java 8** con **NetBeans 8.2**.  
Permite registrar y mostrar equipos de tipo **Desktop**, **Laptop** y **Tablet**, aplicando **POO con herencia**, usando `ArrayList` y capturando datos con `JOptionPane`.

---

## Características
- Clase base `Equipo` con subclases `Desktop`, `Laptop`, `Tablet`.
- Registro de equipos mediante formularios con `JOptionPane`.
- Almacenamiento en `ArrayList` por cada tipo de equipo.
- Menú con opciones para **Registrar** y **Mostrar** equipos.
- Validación de datos de entrada.

---

## Estructura de Paquetes
```
com.todopc
 ├── AppTODOPC.java       # Clase principal con main
 ├── model/               # Clases de modelo (Equipo, Desktop, Laptop, Tablet)
 ├── service/             # Inventario (manejo de ArrayList)
 └── util/                # InputUtils (validaciones con JOptionPane)
```

---

## Requisitos
- **Java JDK 8**
- **NetBeans 8.2**
- Git (opcional para clonar directamente desde GitHub)

---

## Como abrir el proyecto
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/Lyoko97/TODOPC.git
   ```
   O descargarlo en ZIP y descomprimir
2. En NetBeans:  
   - **File → Open Project…**  
   - Seleccionar la carpeta `TODOPC` y abrir
3. Ejecutar con **Run Project** (F6).
