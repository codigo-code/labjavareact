package com.lab.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletUno
 */
public class ServletUno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String emailSoporte; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUno() {
        super();
    }
    
    

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.emailSoporte = config.getInitParameter("email1");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailSoporteAux = this.getServletConfig().getInitParameter("email2");
		 
        ServletOutputStream out = response.getOutputStream();
 
        out.println("<html>");
        out.println("<head><title>Init Servlet</title></head>");
 
        out.println("<body>");
        out.println("<h3>Parametros Inicializados</h3>");
        out.println("<p>Email Soporte = " + this.emailSoporte + "</p>");
        out.println("<p>Email Soporte Auxiliar = " + emailSoporteAux + "</p>");
        out.println("</body>");
        out.println("<html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
