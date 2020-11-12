package com.lab.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forwardDemo")
public class ForwardDemoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3452753301900362414L;

	// Request:
    // http://localhost:8085/ForwardServlet/forwardDemo?forward=true
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // Valor del parametro
        String forward = request.getParameter("forward");
 
        if ("true".equals(forward)) {
            System.out.println("Forward to ShowMeServlet");
 
            // Seteo datos en el request 
            request.setAttribute("ATTRIBUTE_USER_NAME_KEY", "Cristian");
 
            RequestDispatcher dispatcher
                    = request.getServletContext().getRequestDispatcher("/proximo");
            dispatcher.forward(request, response);
 
            return;
        }
        
        ServletOutputStream out = response.getOutputStream();
        out.println("<h3> Demo Servlet </h3>");
        out.println("- servletPath=" + request.getServletPath());
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
	
}
