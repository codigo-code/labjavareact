package com.lab.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/proximo")
public class ProximoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7589091220418770121L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Recupero datos del request
        String value = (String) req.getAttribute("ATTRIBUTE_USER_NAME_KEY");
        String redirect = req.getParameter("redirect");
 
        ServletOutputStream out = resp.getOutputStream();
 
        out.println("<h1>Proximo Servlet</h1>");
        if (value != null) {
        	out.println(value);
        } else if ("true".equals(redirect)) {
        	out.println("Uso redirect");
        } else {
        	out.println("No se como llegue hasta aca!!");
        }
       
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
