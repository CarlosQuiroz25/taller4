package com.example;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        // Crear productos
        Producto producto1 = new Producto("Camiseta", 15.99, 20);
        Producto producto2 = new Producto("Pantalón", 39.99, 10);
        Producto producto3 = new Producto("Zapatos", 60.99, 5);

        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);

        Producto productoBuscado= tienda.buscarProductoPorNombre("Camiseta");

        productoBuscado.mostrarInformacion();

        tienda.mostrarProductosConStockBajo(5);

        tienda.calcularValorTotalInventario();

    }
    
}