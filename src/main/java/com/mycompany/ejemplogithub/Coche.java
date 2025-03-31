/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplogithub;

/**
 *
 * @author Alumno
 */
public class Coche {
    private String marca;
    private String modelo;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para arrancar el coche
    public void arrancar() {
        System.out.println("El coche " + marca + " " + modelo + " ha arrancado.");
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }
//Añadir comentario para ver la diferencia entre ramas bb <3
    public void setMarca(String marca) {
        this.marca = marca;
    }

}
