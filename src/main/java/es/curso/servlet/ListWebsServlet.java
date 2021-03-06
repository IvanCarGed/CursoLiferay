package es.curso.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.entity.Web;
import es.curso.service.DatabaseService;

/**
 * Servlet implementation class ListWebsServlet
 */
@WebServlet("/list-webs.html")
public class ListWebsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListWebsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void proccessRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String address = "/WEB-INF/jsp/webs.jsp";
		
		List<Web> list = DatabaseService.listWebs();
		request.setAttribute("webs", list);
		
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
