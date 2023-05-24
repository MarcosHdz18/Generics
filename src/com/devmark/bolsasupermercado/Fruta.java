package com.devmark.bolsasupermercado;

public class Fruta extends Producto {

    private double peso;

    private String color;

    public Fruta(String color, double peso, String nombre, double precio) {
        super(nombre, precio);
        this.color = color;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}
