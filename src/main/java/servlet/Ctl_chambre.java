package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Chambre;
import forms.Chambre_form;
import modele.ChambreDAO;

/**
 * Servlet implementation class Ctl_chambre
 */
@WebServlet("/Ctl_chambre")
public class Ctl_chambre extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String vue = "/index.jsp";
	final String VUE_DEF = "/WEB-INF/vues/";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ctl_chambre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		Chambre chambre = new Chambre();
		ChambreDAO chambreDao= new ChambreDAO();
		
		if( action != null ) {
			
			if( action.equals("ajouter") ) {
				vue = VUE_DEF + "ajouter.jsp";
				
			}else if( action.equals("detail") ) {
				int id = Integer.valueOf(request.getParameter("idChambre"));
				chambre = chambreDao.getChambre(id);
				request.setAttribute("chambre", chambre);
				vue = VUE_DEF + "detail.jsp";
			
			}else if( action.equals("delete") ) {
				System.out.println(action);
				
				response.sendRedirect("Home");
				return;
			
			}else if( action.equals("update") ) {
				
				vue = VUE_DEF + "ajouter.jsp";
			
			}
		}
		
		getServletContext().getRequestDispatcher(vue).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		ChambreDAO chambreDAO = new ChambreDAO();
		
		if( action.equals("Ajouter") ) {
			Chambre_form form = new Chambre_form();
			Chambre chambre = form.recuperationForm(request);
			chambreDAO.ajouterChambre(chambre);
			response.sendRedirect("Home");
			return;
			
		}else if( action.equals("Modifier") ) {
			System.out.println(action);
		}
		
		doGet(request, response);
	}

}
