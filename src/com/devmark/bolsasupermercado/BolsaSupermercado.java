package com.devmark.bolsasupermercado;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private List<T> productos;

    private int indiceProductos;

    private int maximo = 2;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public List<T> getProductos() {
        return this.productos;
    }

    public void addProductos(T p) {
        if (this.productos.size() <= maximo) {
            this.productos.add(p);
        } else {
            throw new RuntimeException("No existe espacio para añadir más elementos");
        }
    }
}
