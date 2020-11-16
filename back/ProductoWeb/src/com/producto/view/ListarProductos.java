package com.producto.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

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
 * Servlet implementation class ListarProductos
 */
@WebServlet("/listarProductos")
public class ListarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn;
		String errorMensaje = null;
        List<Producto> lista = null;
        
		try {
			conn = ConnectionUtils.getMySQLConnection();
			lista = ProductoDBUtils.obtenerProductos(conn);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
	        errorMensaje = e.getMessage();
		} catch (SQLException e) {
			e.printStackTrace();
	        errorMensaje = e.getMessage();
		}
        
        // Almaceno informacion en el request antes del forward
        request.setAttribute("errorMensaje", errorMensaje);
        request.setAttribute("listaProductos", lista);

        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/pages/listado_productos.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
