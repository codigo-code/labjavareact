package com.lab.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/servlet/info")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletOutputStream out = response.getOutputStream();
		 
	    out.println("<style> span {color:blue;} </style>");
	 
	    String requestURL = request.getRequestURL().toString();
	    out.println("<br><span>requestURL:</span>");
	    out.println(requestURL);
	 
	    String requestURI = request.getRequestURI();
	    out.println("<br><span>requestURI:</span>");
	    out.println(requestURI);
	 
	    String contextPath = request.getContextPath();
	    out.println("<br><span>contextPath:</span>");
	    out.println(contextPath);
	 
	    out.println("<br><span>servletPath:</span>");
	    String servletPath = request.getServletPath();
	    out.println(servletPath);
	 
	    String queryString = request.getQueryString();
	    out.println("<br><span>queryString:</span>");
	    out.println(queryString);
	 
	    String param1 = request.getParameter("text1");
	    out.println("<br><span>getParameter text1:</span>");
	    out.println(param1);
	 
	    String param2 = request.getParameter("text2");
	    out.println("<br><span>getParameter text2:</span>");
	    out.println(param2);
	 
	    // Server Info
	    out.println("<br><br><b>Server info:</b>");
	 
	    out.println("<br><span>serverName:</span>");
	    String serverName = request.getServerName();
	    out.println(serverName);
	 
	    out.println("<br><span>serverPort:</span>");
	    int serverPort = request.getServerPort();
	    out.println(serverPort + "");
	 
	    // Header Infos
	    out.println("<br><br><b>headers:</b>");
	     
	    Enumeration<String> headers = request.getHeaderNames();
	    while (headers.hasMoreElements()) {
	       String header = headers.nextElement();
	       out.println("<br><span>" + header + "</span>: " + request.getHeader(header));
	    }
	 
	    // Servlet Context info:
	    out.println("<br><br><b>Servlet Context info:</b>");
	    ServletContext servletContext = request.getServletContext();
	 
	    // Ubicacion de la aplicacion web en el disco duro
	    out.println("<br><span>realPath:</span>");
	    String realPath = servletContext.getRealPath("");
	    out.println(realPath);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
