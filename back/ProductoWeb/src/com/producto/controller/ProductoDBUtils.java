package com.producto.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.producto.model.Producto;

public class ProductoDBUtils {
	
	public static void insertarProducto(Connection conn, Producto producto) 
			 throws SQLException {
		String sql = "INSERT INTO PRODUCTO (CODIGO, NOMBRE, PRECIO, CANTIDAD) VALUES (?, ?, ?, ?)";
		 
	    PreparedStatement pstm = conn.prepareStatement(sql);
	    
	    // Setear valores, ejecutar update y cerrar
	    pstm.setString(1, producto.getCodigo());
	    pstm.setString(2, producto.getNombre());
	    pstm.setDouble(3, producto.getPrecio());
	    pstm.setInt(4, producto.getCantidad());
	    
	    pstm.executeUpdate();
	    
		pstm.close();
	}
	
	public static List<Producto> obtenerProductos(Connection conn) throws SQLException {
		 String sql = "SELECT CODIGO, NOMBRE, PRECIO, CANTIDAD FROM PRODUCTO";
	 
		 Statement statement = conn.createStatement();

	     ResultSet rs = statement.executeQuery(sql);
	     List<Producto> lista = new ArrayList<Producto>();
	     while (rs.next()) {
	    	 String codigo = rs.getString("CODIGO");
	         String nombre = rs.getString("NOMBRE");
	         Double precio = rs.getDouble("PRECIO");
	         Integer cantidad = rs.getInt("CANTIDAD");
	         Producto producto = new Producto();
	         producto.setCodigo(codigo);
	         producto.setNombre(nombre);
	         producto.setPrecio(precio);
	         producto.setCantidad(cantidad);
	         lista.add(producto);
	     }
	     
	     statement.close();
	     
	     return lista;
	 }
	 
	 public static Producto obtenerProducto(Connection conn, String codigop) throws SQLException {
		 Producto producto = null;
		 String sql = "SELECT P.CODIGO, P.NOMBRE, P.PRECIO, P.CANTIDAD FROM PRODUCTO P WHERE P.CODIGO = ?";
	 
	     PreparedStatement pstm = conn.prepareStatement(sql);
	     pstm.setString(1, codigop);
	 
	     ResultSet rs = pstm.executeQuery();
	 
	     while (rs.next()) {
	    	 String codigo = rs.getString("CODIGO");
	         String nombre = rs.getString("NOMBRE");
	         Double precio = rs.getDouble("PRECIO");
	         Integer cantidad = rs.getInt("CANTIDAD");
	         producto = new Producto();
	         producto.setCodigo(codigo);
	         producto.setNombre(nombre);
	         producto.setPrecio(precio);
	         producto.setCantidad(cantidad);
	     }
	    
	     pstm.close();
	     
	     return producto;
	 }
	 
	 public static void updateProducto(Connection conn, Producto producto) throws SQLException {
		 String sql = "UPDATE PRODUCTO SET NOMBRE=?, PRECIO=?, CANTIDAD=? WHERE CODIGO=?";
	 
	     PreparedStatement pstm = conn.prepareStatement(sql);
	 
	     //pstm.setString(1, producto.getCodigo());
	     pstm.setString(1, producto.getNombre());
	     pstm.setDouble(2, producto.getPrecio());
	     pstm.setInt(3, producto.getCantidad());
	     pstm.setString(4, producto.getCodigo());
	     
	     pstm.executeUpdate();
	     
	     pstm.close();
	 }
	 
	 public static void deleteProduct(Connection conn, String codigo) throws SQLException {
	     String sql = "DELETE FROM PRODUCTO WHERE CODIGO = ?";
	 
	     PreparedStatement pstm = conn.prepareStatement(sql);
	     pstm.setString(1, codigo);
	 
	     pstm.executeUpdate();
	     
	     pstm.close();
	 }
	 
}
