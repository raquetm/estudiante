/*
Para saber la versión de java que tenemos: java --version
sudo apt install openjdk-21-jdk //para instalar la versión 21 de java
mvn javadoc:javadoc //para crear el html de la clase Estudiante del proyecto maven en el que estamos trabajando
mvn test //hacer las pruebas de EstudianteTest para la clase Estudiante en este proyecto maven
*/


package com.raqueltm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EstudianteTest {

    @Test
    public void testAprobo() {
        Estudiante estudiante = new Estudiante("Alex", 20);
        estudiante.setCalificacion(6.0);
        assertTrue(estudiante.aprobo(), "El estudiante debería haber aprobado");
    }

    @Test
    public void testNoAprobo() {
        Estudiante estudiante = new Estudiante("Raquel", 22);
        estudiante.setCalificacion(4.0);
        assertFalse(estudiante.aprobo(), "El estudiante no debería haber aprobado");
    }

    @Test
    public void testEsUniversitario() {
        Estudiante estudiante1 = new Estudiante("Balto", 17);
        Estudiante estudiante2 = new Estudiante("Alice", 18);
        assertFalse(estudiante1.esUniversitario(), "El estudiante no debería ser universitario");
        assertTrue(estudiante2.esUniversitario(), "El estudiante debería ser universitario");
    }
}