package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Utilisateur;
import modele.PersonnelDAO;

/**
 * Servlet implementation class Personnel
 */
@WebServlet( "/Personnel" )
public class Personnel extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Personnel() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        String action = request.getParameter( "action" );
        String vue = "/index.jsp";

        HttpSession session = request.getSession();

        if ( action != null ) {
            if ( action.equals( "deconnexion" ) ) {
                session.invalidate();
                response.sendRedirect( "Home" );
                return;

            } else if ( action.equals( "connexion" ) ) {
                vue = "/WEB-INF/vues/connexion.jsp";
            }
        }

        getServletContext().getRequestDispatcher( vue ).forward( request, response );
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        String login = request.getParameter( "login" );
        String mdp = request.getParameter( "mdp" );

        PersonnelDAO personnelDAO = new PersonnelDAO();
        Utilisateur user = personnelDAO.connexion( login, mdp );

        if ( user != null ) {
            HttpSession session = request.getSession();
            session.setAttribute( "personnel", user );
            response.sendRedirect( "Home" );
            return;
        } else
            System.out.println( "connexion incorecte" );

        doGet( request, response );
    }

}
