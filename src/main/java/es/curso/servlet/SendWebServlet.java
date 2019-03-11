package es.curso.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.entity.Web;
import es.curso.service.DatabaseService;

/**
 * Servlet implementation class SendWebServlet
 */
@WebServlet("/send-web.html")
public class SendWebServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void proccessRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String address = "new-web.jsp?sent=true";
		
		String nombre = request.getParameter("nombre");
		String url = request.getParameter("url");
		String descripcion = request.getParameter("descripcion");
		
		
		Web web = new Web (nombre, url, descripcion);
		DatabaseService.insert(web);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 proccessRequest(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 proccessRequest(request, response);
	}

}
