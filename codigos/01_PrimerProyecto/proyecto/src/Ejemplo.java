// 1. Una sentencia de paquete (package).
// package com.ejemplo.miapp;

// 2. Una o varias sentencias de importación (import).
// import java.util.Date;

// 3. Declaraciones de clases privadas deseadas.
class ClasePrivada {
    private String atributo;

    public ClasePrivada(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
}

// 4. Una declaración de clase pública.
public class Ejemplo {
    // Declaraciones de variables de la clase (estáticas).
    public static final String CONSTANTE = "Constante de la clase";

    // Declaraciones de variables de instancia.
    private String nombre;
    private int edad;

    // Definiciones de constructores.
    public Ejemplo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Definiciones de métodos.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Comentarios en cualquier parte del programa.
    public void mostrarInfo() {
        // Imprime la información del objeto
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Constante: " + CONSTANTE);
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        Ejemplo persona = new Ejemplo("Juan", 25);
        persona.mostrarInfo();

        ClasePrivada cp = new ClasePrivada("Valor privado");
        System.out.println("Atributo de ClasePrivada: " + cp.getAtributo());
    }
}
