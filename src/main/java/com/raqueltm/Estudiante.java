package com.raqueltm;

public class Estudiante {

    private String nombre;      // Nombre del estudiante
    private int edad;           // Edad del estudiante
    private double calificacion;// Calificación del estudiante

    /**
     * Constructor de la clase Estudiante.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Establece la calificación del estudiante.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del estudiante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la calificación del estudiante.
     * @return calificación del estudiante.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Verifica si el estudiante aprobó.
     * @return true si la calificación es mayor o igual a 5.0, false si es menor.
     */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    /**
     * Calcula la edad escolar del estudiante.
     * @return edad escolar del estudiante.
     */
    public int edadEscolar() {
        return edad / 12;
    }

    /**
     * Verifica si el estudiante es universitario.
     * @return true si la edad es mayor o igual a 18, false si es menor.
     */
    public boolean esUniversitario() {
        return edad >= 18;
    }

    /**
     * Imprime la información del estudiante.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}