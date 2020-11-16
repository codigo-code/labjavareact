package com.producto.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.producto.controller.ConnectionUtils;
import com.producto.controller.ProductoDBUtils;
import com.producto.model.Producto;

/**
 * Servlet implementation class CrearProducto
 */
@WebServlet("/crearProducto")
public class CrearProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearProducto() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/pages/alta_productos.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer errorMensaje = new StringBuffer();
		Producto producto = null;
		try {
			Connection conn = ConnectionUtils.getMySQLConnection();
			
			// Leer parametros
			String codigo = request.getParameter("codigo");
			String nombre = request.getParameter("nombre");
			String precioSt = request.getParameter("precio");
			String cantidadSt = request.getParameter("cantidad");
			
			// Validaciones
			if (codigo == null || codigo.isEmpty())  {
				errorMensaje.append("Debe ingresar un código para el producto");
			}
			
			if (nombre == null || nombre.isEmpty())  {
				errorMensaje.append("Debe ingresar un nombre para el producto");
			}
			
			double precio = 0;
			try {
				precio = Double.parseDouble(precioSt);
			} catch (Exception e) {
				errorMensaje.append("Debe ingresar un precio valido para el producto");	
			}
			
			int cantidad = 0;
			try {
				cantidad = Integer.parseInt(cantidadSt);
			} catch (Exception e) {
				
			}
			
			// Construir objeto
			producto = new Producto();
			producto.setCodigo(codigo);
			producto.setNombre(nombre);
			producto.setPrecio(precio);
			producto.setCantidad(cantidad);
			
			// Llamada al insert en la DB
			if (errorMensaje.toString().equals("")) {
				ProductoDBUtils.insertarProducto(conn, producto);
			}
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			errorMensaje.append("Error al establecer conexión con la base de datos: " + e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
			errorMensaje.append("Error al establecer conexión con la base de datos: " + e.getMessage());
		}
		
		// guardar info de creacion y errores en el request
		request.setAttribute("errorMensaje", errorMensaje);
		request.setAttribute("producto", producto);
		
		// en caso de error forward al alta, si no redirect a listado
		if (!errorMensaje.toString().equals("")) {
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/pages/alta_productos.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect(request.getContextPath() + "/listarProductos");
		}
		
	}

}
