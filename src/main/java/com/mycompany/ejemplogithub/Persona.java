/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplogithub;

/**
 *
 * @author Alumno
 */
public class Persona {
 
    private String nombre;
    private int edad;

    // Constructor
    //Los nombres en mayúsculas
    public Persona(String nombre, int edad) {
        this.nombre.toUpperCase();
        this.edad = edad;
    }

    // Método para que la persona conduzca un coche
    public void conducirCoche(Coche coche) {
        System.out.println(nombre + " está conduciendo el coche " + coche.getMarca());
        coche.arrancar();
    }

    // Getters y Setters
    //Añadimos comentarios
    //Más comentarios
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
}
    

