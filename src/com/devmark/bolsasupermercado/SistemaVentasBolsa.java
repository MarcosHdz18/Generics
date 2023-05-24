package com.devmark.bolsasupermercado;

public class SistemaVentasBolsa {
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> frutaBolsaSupermercado = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> limpiezaBolsaSupermercado = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> lacteoBolsaSupermercado = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> noPerecibleBolsaSupermercado = new BolsaSupermercado<>();

        frutaBolsaSupermercado.addProductos(new Fruta("roja", 200, "Manzana roja", 40));
        frutaBolsaSupermercado.addProductos(new Fruta("amarillo", 100, "Mango Ataulfo", 300));

        limpiezaBolsaSupermercado.addProductos(new Limpieza("Antibacterial", 2.5, "Fabuloso", 28));
        limpiezaBolsaSupermercado.addProductos(new Limpieza("Cloro", 1.5, "Cloralex", 15));

        lacteoBolsaSupermercado.addProductos(new Lacteo(3, 25, "Leche de Chocolate", 25));
        lacteoBolsaSupermercado.addProductos(new Lacteo(5, 50, "Queso", 45));

        noPerecibleBolsaSupermercado.addProductos(new NoPerecible("Arroz de grano grande", 30, 150, 500));
        noPerecibleBolsaSupermercado.addProductos(new NoPerecible("Atún aleta amarilla", 30, 150, 500));

        System.out.println("=============================Frutas=============================");
        for (Fruta fruta: frutaBolsaSupermercado.getProductos()) {
            System.out.println("========================="+ fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso(gr): " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        }

        System.out.println("=============================Limpieza=============================");
        for (Limpieza limpieza: limpiezaBolsaSupermercado.getProductos()) {
            System.out.println("========================="+ limpieza.getNombre());
            System.out.println("Precio: " + limpieza.getPrecio());
            System.out.println("Componentes: " + limpieza.getComponentes());
            System.out.println("Litros(lt): " + limpieza.getLitros());
        }
    }
}
