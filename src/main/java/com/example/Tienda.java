package com.example;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);

    }

    public Tienda() {

    }

    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;

    }


    public double calcularValorTotalInventario() {

        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioTotal();
        }
        return total;

    }

    public void mostrarProductosConStockBajo(int limite ){
        for (Producto producto : productos) {
            if (producto.getStock() <= limite) {
                producto.mostrarInformacion();
            }
        }
    }

}
