package com.example;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
        
    }

    public void mostrarInformacion(){
        System.out.println(this.nombre);
        System.out.println(this.precio);
        System.out.println(this.stock);
    }
    public void actualizarStock(int stock){
        if (stock >= 0) {
            this.stock = stock;
            System.out.println(this.stock);
        } else{
            System.out.println("El stock debe ser un valor positivo");
        }
    }

    public double calcularPrecioTotal(){
        double total = precio * stock;
        System.out.println(total);
        return total;
    }

    
}
