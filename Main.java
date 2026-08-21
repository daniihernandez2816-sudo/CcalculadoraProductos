/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraProductos;

import java.util.Scanner;
/**
 *
 * @author Daniela Hernandez
 */
public class Main {
    public static void main (String[]args){
        //Crear objeto Scanner para ingresar los datos por teclado 
        Scanner sc = new Scanner (System.in);
        
        //Solicitar el nombre del producto
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        
        //Solicitar el precio
        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        
        //Solicitar cantidad
        System.out.println("Imgrese la cantidad: ");
        int cantidad = sc.nextInt();
        
        // Crear objeto de la clase producto
        Producto producto1 = new Producto(nombre, precio, cantidad);
        
        //Factura cliente, se muestran los datos y el total dela compra 
        
        System.out.println("---FACTURA DE COMPRA---");
        
        System.out.println("Producto: " + producto1.getNombre());
        
        System.out.println("Precio: $ " + producto1.getPrecio(precio));
        
        System.out.println("Cantidad : " + producto1.getCantidad());
        
        System.out.println("Total a pagar: $ " + producto1.calcularTotal());
        
        //Cerrar Scanner
        sc.close();
     
    }
      
}
