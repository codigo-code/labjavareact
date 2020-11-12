package com.lab.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirectDemo")
public class RedirectServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3080547723459790796L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Obtengo valor del parametro redirect.
        String redirect = req.getParameter("redirect");
 
        if ("true".equals(redirect)) {
            System.out.println("Redirect a ProximoServlet");
 
            String contextPath = req.getContextPath();
            resp.sendRedirect(contextPath + "/proximo?redirect=true");
            return;
        }
 
        ServletOutputStream out = resp.getOutputStream();
        out.println("<h3>Redirect Servlet</h3>");
        out.println("- servletPath=" + req.getServletPath());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
