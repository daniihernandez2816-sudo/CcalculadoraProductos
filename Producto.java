/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraProductos;

/**
 *
 * @author Daniela Hernandez
 */
public class Producto {
    
    //Atributos privados 
    private String nombre;
    private double precio;
    private int cantidad;
    
    //Constructor
    public Producto (String nombre,double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    //Getters y setters Nombre
    public String getNombre (){
        return nombre;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    //Getters y setters Precio
    public double getPrecio(double precio){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    //Getters y setters Cantidad
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad (int cantidad){
        this.cantidad = cantidad;
    }
    
    //Método para calcular el total
    public double calcularTotal(){
        return precio * cantidad;
    }
   
}
